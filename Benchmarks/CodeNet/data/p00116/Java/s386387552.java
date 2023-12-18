import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	/*
	 *	...*....**
	 *	..........
	 *	**....**..
	 *	........*.
	 *	..*.......
	 *	..........
	 *	.*........
	 *	..........
	 *	....*..***
	 *	.*....*...
	 */
	
	public static class Rect{
		int start, height;

		public Rect(int start, int height) {
			super();
			this.start = start;
			this.height = height;
		}
		
		public String toString(){
			return "pos = " + start + " , height = " + height;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			if(H == 0 && W == 0){
				break;
			}
			
			boolean[][] wall = new boolean[H][W];
			
			for(int i = 0; i < H; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < W; j++){
					if(input[j] == '*'){
						wall[i][j] = true;
					}
				}
			}
			
			int[][] count = new int[H][W];
			
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(wall[i][j]){
						count[i][j] = 0;
					}else if(i == 0){
						count[i][j] = 1;
					}else{
						count[i][j] = count[i-1][j] + 1;
					}
				}
			}
			
			int sek = 0;
			for(int i = 0; i < H; i++){
				Stack<Rect> stack= new Stack<Rect>();
				stack.push(new Rect(0, 0));
				//System.out.println(i);
				int max = 0;
				for(int j = 0; j < W; j++){
					Rect prev_del = null;
					//System.out.println(stack);
					
					if(stack.peek().height < count[i][j]){
						stack.add(new Rect(j, count[i][j]));
					}else{
						while(stack.size() != 0){
							Rect r = stack.peek();
							
							//System.out.println("=> " + r);
							
							if(r.height > count[i][j]){
								max = Math.max(max, r.height * (j - r.start));
								prev_del = r;
								stack.pop();
							}else if(r.height == count[i][j]){
								max = Math.max(max, r.height * (j - r.start));
								prev_del = null;
								break;
							}else{
								break;
							}
						}
					
						if(prev_del != null){
							stack.push(new Rect(prev_del.start ,count[i][j]));
						}
					}
				}
				//System.out.println(stack);
				for(Rect r : stack){
					max = Math.max(max, r.height * (W - r.start));
				}
				
				sek = Math.max(sek, max);
			}
			
			System.out.println(sek);
		}
	}
}