import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt(); int W = stdIn.nextInt();
		int Ch = stdIn.nextInt() - 1; 
		int Cw = stdIn.nextInt() - 1;
		int Dh = stdIn.nextInt() - 1;
		int Dw = stdIn.nextInt() - 1;
		
		char[][] S = new char[H][W];
		int[][] scoreMap = new int[H][H];
		
		for(int i = 0; i < H; i ++) {
			char[] s = stdIn.next().toCharArray();
			for(int j = 0; j < W; j ++) {
				S[i][j] = s[j];
				scoreMap[i][j] = -1;
			}
		}
		
		Queue<Integer> route0 = new ArrayDeque<Integer>();
		Queue<Integer> route1 = new ArrayDeque<Integer>();
		
		route0.add(Ch);
		route0.add(Cw);
		route1.add(Ch);
		route1.add(Cw);
		scoreMap[Ch][Cw] = 0;
		
		while(true) {
			int h = route0.poll();
			int w = route0.poll();
			
			// Up
			if(0 <= h - 1 && S[h - 1][w] == '.' && scoreMap[h - 1][w] == -1) {
				scoreMap[h - 1][w] = scoreMap[h][w];
				route0.add(h - 1);
				route0.add(w);
				route1.add(h - 1);
				route1.add(w);
			}
			
			// Down
			if(h + 1 < H && S[h + 1][w] == '.' && scoreMap[h + 1][w] == -1) {
				scoreMap[h + 1][w] = scoreMap[h][w];
				route0.add(h + 1);
				route0.add(w);
				route1.add(h + 1);
				route1.add(w);
			}
			
			//Left
			if(0 <= w - 1 && S[h][w - 1] == '.' && scoreMap[h][w - 1] == -1) {
				scoreMap[h][w - 1] = scoreMap[h][w];
				route0.add(h);
				route0.add(w - 1);
				route1.add(h);
				route1.add(w - 1);
			}
			
			// Right
			if(w + 1 < W && S[h][w + 1] == '.' && scoreMap[h][w + 1] == -1) {
				scoreMap[h][w + 1] = scoreMap[h][w];
				route0.add(h);
				route0.add(w + 1);
				route1.add(h);
				route1.add(w + 1);
			}
			
			if(route0.size() == 0) {
				while(true) {
					int h1 = route1.poll();
					int w1 = route1.poll();
					
					for(int i = -2; i < 2; i ++) {
						for(int j = -2; j < 2; j ++) {
							if(0 <= h1 + i && h1 + i < H && 0 <= w1 + j && w1 + j < W) {
								if(S[h1 + i][w1 + j] == '.' && scoreMap[h1 + i][w1 + j] == -1) {
									scoreMap[h1 + i][w1 + j] = scoreMap[h1][w1] + 1;
									route0.add(h1 + i);
									route0.add(w1 + j);
								}
							}
						}
					}
					
					if(route1.size() == 0) {
						break;
					}
				}
			}
			
			if(route0.size() == 0 && route1.size() == 0) {
				break;
			}
		}
		
//		showMap(S);
//		showScore(scoreMap);
		
		System.out.println(scoreMap[Dh][Dw]);
		
	}
	
	private static void showMap(char[][] map) {
		for(int i = 0; i < map.length; i ++) {
			for(int j = 0; j < map[i].length; j ++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void showScore(int[][] scoreMap) {
		for(int i = 0; i < scoreMap.length; i ++) {
			for(int j = 0; j < scoreMap[i].length; j ++) {
				System.out.print(scoreMap[i][j]);
			}
			System.out.println();
		}
	}
}