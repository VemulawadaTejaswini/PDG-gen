import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static class Cube{
		char top;
		char front;
		char right;
		char left;
		char back;
		char bottom;
		
		public Cube(char top, char front, char right, char left, char back,char bottom) {
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
			
			sb.append(top);
			sb.append(" " + front);
			sb.append(" " + right);
			sb.append(" " + left);
			sb.append(" " + back);
			sb.append(" " + bottom);
			
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
			final char next_top = front;
			final char next_front = bottom;
			final char next_bottom = back;
			final char next_back = top;
			final char next_right = right;
			final char next_left = left;
			
			top = next_top;
			front = next_front;
			right = next_right;
			left = next_left;
			back = next_back;
			bottom = next_bottom;
		}
		
		public void right_turn(){
			final char next_top = top;
			final char next_front = left;
			final char next_bottom = bottom;
			final char next_back = right;
			final char next_right = front;
			final char next_left = back;
			
			top = next_top;
			front = next_front;
			right = next_right;
			left = next_left;
			back = next_back;
			bottom = next_bottom;
		}
		
		public void twist_turn(){
			final char next_top = left;
			final char next_front = front;
			final char next_bottom = right;
			final char next_back = back;
			final char next_right = top;
			final char next_left = bottom;
			
			top = next_top;
			front = next_front;
			right = next_right;
			left = next_left;
			back = next_back;
			bottom = next_bottom;
		}
		
		public boolean contain_pair(char a){
			if(check(top, a)){
				return true;
			}else if(check(front, a)){
				return true;
			}else if(check(right, a)){
				return true;
			}else if(check(left, a)){
				return true;
			}else if(check(back, a)){
				return true;
			}else if(check(bottom, a)){
				return true;
			}
			
			return false;
		}
	}
	
	public static boolean check(char a, char b){
		if(a == b){
			return false;
		}else if(Math.abs((int)(a) - (int)(b)) == Math.abs((int)('A') - (int)('a'))){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean dfs(int deep, int N, Cube[][][] pazzle, boolean[] is_used, Cube[] cubes){
		int z = (deep >> 2) & 1;
		int y = (deep >> 1) & 1;
		int x = deep & 1;
		
		if(deep == N){
			return true;
		}
		
		for(int use = 0; use < 8; use++){
			if(is_used[use]){
				continue;
			}
			
			Cube using = cubes[use];
			
			if(x != 0 && pazzle[z][y][x-1] != null && !using.contain_pair(pazzle[z][y][x-1].left)){
				continue;
			}
			
			if(x != 1 && pazzle[z][y][x+1] != null && !using.contain_pair(pazzle[z][y][x+1].right)){
				continue;
			}
			
			if(y != 0 && pazzle[z][y-1][x] != null && !using.contain_pair(pazzle[z][y-1][x].front)){
				continue;
			}
			
			if(y != 1 && pazzle[z][y+1][x] != null && !using.contain_pair(pazzle[z][y+1][x].back)){
				continue;
			}
			
			if(z != 0 && pazzle[z-1][y][x] != null && !using.contain_pair(pazzle[z-1][y][x].bottom)){
				continue;
			}
			
			if(z != 1 && pazzle[z+1][y][x] != null && !using.contain_pair(pazzle[z+1][y][x].top)){
				continue;
			}
			
			is_used[use] = true;
			
			for(int i = 0; i < 4; i++){
				using.up_turn();
				
				for(int j = 0; j < 4; j++){
					using.right_turn();
					
					for(int k = 0; k < 4; k++){
						using.twist_turn();
						
						if(x != 0 && pazzle[z][y][x-1] != null && !check(pazzle[z][y][x-1].left , using.right)){
							continue;
						}
						
						if(x != 1 && pazzle[z][y][x+1] != null && !check(pazzle[z][y][x+1].right , using.left)){
							continue;
						}
						
						if(y != 0 && pazzle[z][y-1][x] != null && !check(pazzle[z][y-1][x].front , using.back)){
							continue;
						}
						
						if(y != 1 && pazzle[z][y+1][x] != null && !check(pazzle[z][y+1][x].back , using.front)){
							continue;
						}
						
						if(z != 0 && pazzle[z-1][y][x] != null && !check(pazzle[z-1][y][x].bottom , using.top)){
							continue;
						}
						
						if(z != 1 && pazzle[z+1][y][x] != null && !check(pazzle[z+1][y][x].top , using.bottom)){
							continue;
						}
						
						pazzle[z][y][x] = using;
						if(dfs(deep + 1, N, pazzle, is_used, cubes)){
							return true;
						}
						pazzle[z][y][x] = null;
					}
				}
			}
			
			is_used[use] = false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String input = sc.next();
			
			if("0".equals(input)){
				break;
			}
			
			char[] in_char = input.toCharArray();
			
			Cube[] cubes = new Cube[8];
			for(int i = 0; i < 8; i++){
				final char top    = in_char[0];
				final char front  = in_char[1];
				final char right  = in_char[2];
				final char left   = in_char[3];
				final char back   = in_char[4];
				final char bottom = in_char[5];
				
				cubes[i] = new Cube(top, front, right, left, back, bottom);
				
				if(i != 7){
					in_char = sc.next().toCharArray();
				}
			}
			
			System.out.println(dfs(0, 8, new Cube[2][2][2], new boolean[8], cubes) ? "YES" : "NO");
			
		}
	}
}