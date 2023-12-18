

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		StringTokenizer st1= new StringTokenizer(br.readLine());
		int sr=Integer.parseInt(st1.nextToken());
		int sc=Integer.parseInt(st1.nextToken());
		StringTokenizer st2= new StringTokenizer(br.readLine());
		int dr=Integer.parseInt(st2.nextToken());
		int dc=Integer.parseInt(st2.nextToken());
		
		char[][] maze=new char[h][w];
		for(int i=0;i<h;i++) {
			String s=br.readLine();
			for(int j=0;j<w;j++) {
				maze[i][j]=s.charAt(j);
			}
		}
		System.out.println(solve(maze,h,w,sr-1,sc-1,dr-1,dc-1));

	}

	private static int solve(char[][] maze, int h, int w, int sr, int sc, int dr, int dc) {
		
		Queue<int[]> q=new LinkedList<>();
		q.add(new int[] {sr,sc,0});
		int steps=0;
		while(q.size()>0) {
			int size=q.size();
			while(size-->0) {
				int[] top=q.poll();
				
				
				
			}
		}
		return -1;
	}

}
