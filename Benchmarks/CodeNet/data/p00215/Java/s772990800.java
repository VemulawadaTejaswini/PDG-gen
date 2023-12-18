import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x == 0 && y == 0) break;
			
			char[][] map = new char[y][];
			
			Node[][] list = new Node[5][1500];


			int[] p      = new int[5];
			Node start = null;
			Node goal  = null;
			for(int i = 0; i < y; i++) {
				map[i] = sc.next().toCharArray();
				for(int j = 0; j < x; j++) {
					if     (map[i][j] == '.') continue;
					else if(map[i][j] == 'S') start = new Node(j,i,-1,0);
					else if(map[i][j] == 'G') goal  = new Node(j,i,-1,0);
					else list[map[i][j] - '1'][p[map[i][j] - '1']] = new Node(j,i,map[i][j] - '1',p[map[i][j] - '1']++);
				}
			}
			if(start == null || goal == null) {
				System.out.println("NA");
				continue;
			
			}
			int min = Integer.MAX_VALUE;
			int id = -1;
			PriorityQueue<Data> queue = new PriorityQueue<Data>();
			
			for(int i = 0; i < 5; i++) {
				queue.clear();
				int[][] minList = new int[5][1500];
				for(int j = 0; j < 5; j++) {
					Arrays.fill(minList[j], Integer.MAX_VALUE);
				}
				int ans = Integer.MAX_VALUE;
				start.type = i;
				queue.add(new Data(0,start));
				while(!queue.isEmpty()) {
					Data tmp = queue.poll();
					
					if(tmp.now == goal) {
						ans = tmp.cost;
						break;
					}
					if(minList[tmp.now.type][tmp.now.id] != Integer.MAX_VALUE) continue;
					
					minList[tmp.now.type][tmp.now.id] = tmp.cost;
					
					if(tmp.now.type == (i+4)%5) {
						queue.add(new Data(tmp.cost + Math.abs(tmp.now.x - goal.x) + Math.abs(tmp.now.y - goal.y),goal));
						continue;
					}
					
					
					for(int j = 0; j < p[(tmp.now.type+1)%5]; j++) {
						queue.add(new Data(tmp.cost + Math.abs(tmp.now.y - list[(tmp.now.type+1)%5][j].y) + Math.abs(tmp.now.x - list[(tmp.now.type+1)%5][j].x),list[(tmp.now.type+1)%5][j]));
					}
				}
				if(min > ans) {
					id = i+1;
					min = ans;
				}
				
			}
			System.out.println((id == -1 || min == Integer.MAX_VALUE)?"NA":id + " " + min);
			
			System.gc();
		}
	}
	static class Data implements Comparable<Data>{
		int cost;
		Node now;
		
		Data(int a, Node b) {
			cost = a;
			now = b;
		}
		
		@Override
		public int compareTo(Data o) {
			return this.cost - o.cost;
		}
		
	}
	
	static class Node {
		int x;
		int y;
		int type;
		int id;
		Node(int a, int b,int c,int d) {
			x = a;
			y = b;
			type = c;
			id = d;
		}
	}



}