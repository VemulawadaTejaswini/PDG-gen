import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

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
		int h,w;
		
		static HashMap<Integer, HashMap<Integer, Rect>> hash = new HashMap<Integer, HashMap<Integer,Rect>>();
		
		public Rect(int h, int w){
			this.h = h;
			this.w = w;
		}
		
		public boolean dup(Rect other){
			if(this.h >= other.h && this.w >= other.w){
				return true;
			}else{
				return false;
			}
		}
		
		public static Rect getInstance(int h, int w){
			if(hash.get(h) != null){
				if(hash.get(h).get(w) != null){
					
				}else{
					hash.get(h).put(w, new Rect(h, w));
				}
			}else{
				HashMap<Integer, Rect> tmp = new HashMap<Integer, Rect>();
				tmp.put(w, new Rect(h, w));
				hash.put(h, tmp);
			}
			
			return hash.get(h).get(w);
		}
		
		public String toString(){
			return this.h + " " + this.w;
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
			
			boolean[][] wall = new boolean[H + 2][W + 2];
			
			for(int i = 0; i < H; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < W; j++){
					if(input[j] == '*'){
						wall[i + 1][j + 1] = true;
					}
				}
			}
			
			for(int i = 0; i < H + 2; i++){
				for(int j = 0; j < W + 2; j++){
					if(i == 0 || j == 0 || i == H + 1 || j == W + 1){
						wall[i][j] = true;
					}
				}
			}
			
			ArrayList<ArrayList<LinkedList<Rect>>> DP = new ArrayList<ArrayList<LinkedList<Rect>>>(H + 2);
			for(int i = 0; i < H + 2; i++){
				ArrayList<LinkedList<Rect>> inner_array = new ArrayList<LinkedList<Rect>>(W + 2);
				for(int j = 0; j < W + 2; j++){
					inner_array.add(new LinkedList<Rect>());
				}
				DP.add(inner_array);
			}
			
			int max = 0;
			for(int i = 1; i < H + 1; i++){
				for(int j = 1; j < W + 1; j++){
					if(wall[i][j]){
						continue;
					}
					
					{
						boolean flag = true;
						Rect r1 = Rect.getInstance(1, 1);
						for(Rect r : DP.get(i).get(j)){
							if(r.dup(r1)){
								flag = false;
								break;
							}
						}
						
						if(flag){
							DP.get(i).get(j).add(r1);
						}
					}
					
					int w_max = 1;
					int h_max = 1;
					if(!wall[i][j-1]){	
						for(Rect r : DP.get(i).get(j-1)){
							w_max = Math.max(w_max, r.w + 1);
						}
					}
					if(!wall[i-1][j]){	
						for(Rect r : DP.get(i-1).get(j)){
							h_max = Math.max(h_max, r.h + 1);
						}
					}
					
					//System.out.println(h_max + " " + w_max);
					if(!wall[i][j-1]){
						for(Rect r : DP.get(i).get(j-1)){
							{
								boolean flag = true;
								Rect r1 = Rect.getInstance(Math.min(r.h, h_max), r.w + 1);
								for(Iterator<Rect> iter = DP.get(i).get(j).iterator(); iter.hasNext(); ){
									Rect r2 = iter.next();
									
									if(r2.dup(r1)){
										flag = false;
										break;
									}else if(r1.dup(r2)){
										iter.remove();
									}
								}
								
								if(flag){
									//System.out.println("1 => " +  r1);
									DP.get(i).get(j).add(r1);
								}
							}
						}
					}
					
					if(!wall[i-1][j]){	
						for(Rect r : DP.get(i-1).get(j)){
							{
								boolean flag = true;
								Rect r1 = Rect.getInstance(r.h + 1, Math.min(r.w, w_max));
								for(Iterator<Rect> iter = DP.get(i).get(j).iterator(); iter.hasNext(); ){
									Rect r2 = iter.next();
									
									if(r2.dup(r1)){
										flag = false;
										break;
									}else if(r1.dup(r2)){
										iter.remove();
									}
								}
								
								if(flag){
									//System.out.println("2 => " + r1);
									DP.get(i).get(j).add(r1);
								}
							}
						}
					}
					
					
					//System.out.println((i - 1) + " : " + (j - 1) + " => " + DP.get(i).get(j));
					for(Rect r : DP.get(i).get(j)){
						max = Math.max(max, r.h * r.w);
					}
				}
			}
			
			System.out.println(max);
		}
	}
}