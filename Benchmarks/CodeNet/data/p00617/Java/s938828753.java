import java.util.*;
import java.awt.Rectangle;

public class Main{
	private static char[] s;
	private static int pos;
	private static ArrayList<GUI> al;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			al = new ArrayList<GUI>();
			s = sc.next().toCharArray();
			pos = 0;
			parse();

			for(int i=0;i<n;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int min = Integer.MAX_VALUE;
				int minIdx = -1;

				for(int j=0;j<al.size();j++){
					if(al.get(j).r.contains(x,y) && al.get(j).child < min){
						min = al.get(j).child;
						minIdx = j;
					}
				}

				System.out.println(minIdx==-1 ? "OUT OF MAIN PANEL 1" : (al.get(minIdx).name + " " + al.get(minIdx).child));
			}
		}
	}

	private static void parse(){
		String name = start();
		int[] v = value();
		int child = 0;
		while(s[pos] == '<' && s[pos+1] != '/'){
			parse();
			child++;
		}
		end();

		GUI gui = new GUI(name,v[0],v[1],v[2],v[3],child);
		al.add(gui);
	}

	private static String start(){
		String res = "";
		pos++;
		while(s[pos] != '>'){
			res += s[pos++];
		}
		pos++;
		return res;
	}

	private static int[] value(){
		String tmp = "";
		while(s[pos] != '<'){
			tmp += s[pos++];
		}
		String[] tt = tmp.split(",");
		int[] res = new int[4];

		for(int i=0;i<4;i++){
			res[i] = Integer.parseInt(tt[i]);
		}
		return res;
	}

	private static void end(){
		while(s[pos++] != '>');
	}
}

class GUI{
	String name;
	Rectangle r;
	int child;

	GUI(String name,int x1,int y1,int x2,int y2,int child){
		this.name = name;
		this.r = new Rectangle(x1,y1,x2-x1,y2-y1);
		this.r.setBounds(x1-1,y1-1,x2-x1+2,y2-y1+2);
		this.child = child;
	}
}