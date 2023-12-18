import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static class Component {
		int lux, luy, rdx, rdy;
		ArrayList<Component> child;
		String name;
		
		public Component(String name, int lux, int luy, int rdx, int rdy) {
			super();
			this.name = name;
			this.lux = lux;
			this.luy = luy;
			this.rdx = rdx;
			this.rdy = rdy;
			
			child = new ArrayList<Component>();
		}
		
		public boolean is_hit(int x, int y){
			if(this.lux <= x && x <= this.rdx && this.luy <= y && y <= this.rdy){
				return true;
			}else{
				return false;
			}
		}
		
		public Component getHitChild(int x, int y){
			for(Component comp : child){
				if(comp.is_hit(x, y)){
					return comp;
				}
			}
			
			return null;
		}
		
		public int getChildSize(){
			return child.size();
		}
		
		public String toString(){
			return "<" + lux + ", " + luy + "> " + name + " <" + rdx + ", " + rdy + "> => " + child;
		}
	}
	
	public static int parse(Component owner, char[] input, int first, int last){
		if(input[first] != '<'){
			return last;
		}
		StringBuilder sb = new StringBuilder();
		
		int pos = first + 1;
		while(input[pos] != '>'){
			sb.append(input[pos]);
			pos++;
		}
		
		pos++;
		int lux = 0, luy = 0, rdx = 0, rdy = 0;
		
		while(input[pos] != ','){
			lux *= 10;
			lux += input[pos] - '0';
			pos++;
		}
		pos++;
		
		while(input[pos] != ','){
			luy *= 10;
			luy += input[pos] - '0';
			pos++;
		}
		pos++;
		
		while(input[pos] != ','){
			rdx *= 10;
			rdx += input[pos] - '0';
			pos++;
		}
		pos++;
		
		while(input[pos] != '<'){
			rdy *= 10;
			rdy += input[pos] - '0';
			pos++;
		}
		
		Component comp = new Component(sb.toString(), lux, luy, rdx, rdy);
		//System.out.println(sb.toString());
		if(owner != null){
			owner.child.add(comp);
		}
		
		while(input[pos] == '<' && input[pos + 1] != '/'){
			pos = parse(comp, input, pos, last);
		}
		
		//System.out.println(sb.toString() + " : " + (pos) + " : " + (pos + sb.length() + 3));
		return pos + sb.length() + 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			char[] input = sc.next().toCharArray();
			Component owner = new Component("OUT OF MAIN PANEL", 0, 0, 10000, 10000);
			
			parse(owner, input, 0, input.length - 1);
			
			//System.out.println(owner);
			
			for(int i = 0; i < n; i++){
				Component just_hit = owner;
				
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				while(just_hit.is_hit(x, y) && just_hit.getHitChild(x, y) != null){
					just_hit = just_hit.getHitChild(x, y);
				}
				
				System.out.println(just_hit.name + " " + just_hit.getChildSize());
			}

		}

		sc.close();
	}
}