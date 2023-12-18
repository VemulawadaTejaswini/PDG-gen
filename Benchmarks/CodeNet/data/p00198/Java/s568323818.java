import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static class Cube{
		int top;
		int front;
		int right;
		int left;
		int back;
		int bottom;
		
		public Cube(int top, int front, int right, int left, int back,int bottom) {
			super();
			this.top = top;
			this.front = front;
			this.right = right;
			this.left = left;
			this.back = back;
			this.bottom = bottom;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			sb.append(str[top]);
			sb.append(" " + str[front]);
			sb.append(" " + str[right]);
			sb.append(" " + str[left]);
			sb.append(" " + str[back]);
			sb.append(" " + str[bottom]);
			
			return sb.toString();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj){
				return true;
			}else if (obj == null){
				return false;
			}else if (!(obj instanceof Cube)){
				return false;
			}
			Cube other = (Cube) obj;
			
			boolean flag = false;
			for(int i = 0; i < 4; i++){
				other.up_turn();
				
				for(int j = 0; j < 4; j++){
					other.right_turn();
					
					for(int k = 0; k < 4; k++){
						other.twist_turn();
						
						if(flag){
							continue;
						}else if(this.left     == other.left 
								&& this.right  == other.right
								&& this.back   == other.back
								&& this.bottom == other.bottom
								&& this.top    == other.top
								&& this.front  == other.front){
							flag = true;
						}
					
						//System.out.println("[" + this + "] [" + other + "] " + flag);
					}
				}
			}
			
			return flag;
		}

		public void up_turn(){
			final int next_top = front;
			final int next_front = bottom;
			final int next_bottom = back;
			final int next_back = top;
			final int next_right = right;
			final int next_left = left;
			
			top = next_top;
			front = next_front;
			right = next_right;
			left = next_left;
			back = next_back;
			bottom = next_bottom;
		}
		
		public void right_turn(){
			final int next_top = top;
			final int next_front = left;
			final int next_bottom = bottom;
			final int next_back = right;
			final int next_right = front;
			final int next_left = back;
			
			top = next_top;
			front = next_front;
			right = next_right;
			left = next_left;
			back = next_back;
			bottom = next_bottom;
		}
		
		public void twist_turn(){
			final int next_top = left;
			final int next_front = front;
			final int next_bottom = right;
			final int next_back = back;
			final int next_right = top;
			final int next_left = bottom;
			
			top = next_top;
			front = next_front;
			right = next_right;
			left = next_left;
			back = next_back;
			bottom = next_bottom;
		}
	}
	
	public static String[] str = new String[]{"Cyan", "Yellow", "Red", "Magenta", "Green", "Blue"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < str.length; i++){
			map.put(str[i], i);
		}
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<Cube> cubes = new ArrayList<Cube>(n);
			for(int i = 0; i < n; i++){
				final int top    = map.get(sc.next());
				final int front  = map.get(sc.next());
				final int right  = map.get(sc.next());
				final int left   = map.get(sc.next());
				final int back   = map.get(sc.next());
				final int bottom = map.get(sc.next());
				
				cubes.add(new Cube(top, front, right, left, back, bottom));
				
				//System.out.println(cubes);
			}
			//cubes.get(1).up_turn();
			//System.out.println(cubes.get(0).equals(cubes.get(1)));
			
			for(int i = 0; i < cubes.size(); i++){
				Cube cube = cubes.get(i);
				
				for(int j = cubes.size() - 1; j > i; j--){
					if(cube.equals(cubes.get(j))){
						//System.out.println("t");
						cubes.remove(j);
					}
				}
			}
			
			System.out.println(n - cubes.size());
			
		}
	}
}