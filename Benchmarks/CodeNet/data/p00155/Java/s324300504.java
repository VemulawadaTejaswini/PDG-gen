//package _0155;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	Scanner sc =new Scanner(System.in);
	
	class p2 implements Comparable<p2>{
		int f;
		double s;
		String ans;
		
		p2(int f, double s ,String ans){
			this.f = f;
			this.s = s;
			this.ans = ans;
		}
		
		public int compareTo(p2 arg0) {
			// TODO Auto-generated method stub
			return Double.compare(s, arg0.s);
		}
		
	}
	
	void run(){
		for(;;){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int b[] = new int[n];
			int x[] = new int[n];
			int y[] = new int[n];
			int inv[] = new int[1001];
			
			double cost[][] = new double[n][n];
			for(int i = 0 ; i < n ; i++){
				Arrays.fill(cost[i],Double.MAX_VALUE);
			}
			
			for(int i = 0; i < n ; i++){
				b[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				
				inv[b[i]] = i;

				cost[i][i] = 0;
				for(int j = 0; j < i ; j++){
					if((x[i]-x[j])*(x[i]-x[j]) +(y[i]-y[j])*(y[i]-y[j]) <= 50*50){
						cost[i][j] = Math.sqrt((x[i]-x[j])*(x[i]-x[j]) +(y[i]-y[j])*(y[i]-y[j]));
						cost[j][i] = cost[i][j];
		//				System.out.println(cost[i][j]);
					}
				}
			}
			
			int m = sc.nextInt();
			int s[] = new int[m];
			int g[] = new int[m];
			
			for(int i = 0; i < m;i++){
				s[i] = sc.nextInt();
				g[i] = sc.nextInt();
			}
			
			for(int i = 0; i < m ; i++){
				int start = inv[s[i]];
				int goal = inv[g[i]];
				
				PriorityQueue <p2> q = new PriorityQueue<p2>();
				q.add(new p2(start,0,s[i]+""));
				
				boolean reached[] = new boolean[n];
								
				double cost2[] = new double[n];
				
				Arrays.fill(cost2, Double.MAX_VALUE);
				for(;;){
//					System.out.println(q.size());
					if(q.isEmpty()){
						System.out.println("NA");
						break;
					}
					
					p2 p = q.poll();
					if(reached[p.f]){
						continue;
					}
					if(p.f == goal){
						System.out.println(p.ans);
						break;
					}
					
					reached[p.f]= true;
					cost2[p.f] = p.s;
					for(int j = 0; j < n ;j++){
						if(!reached[j]){
							if(p.s + cost[p.f][j] < cost2[j]){
								q.add(new p2(j , p.s + cost[p.f][j] , p.ans + " "+b[j]));
							}							
						}
					}
					
				}
				
				
				
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}