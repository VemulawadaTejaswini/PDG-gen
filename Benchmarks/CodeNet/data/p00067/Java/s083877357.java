import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		try{
			root:
			while(true){
				String st;
				int count = 0;
				int[][] map = new int[14][14];
				while(true){
					st = sc.readLine();
					if(st==null)
						break root;
					if(!st.isEmpty())
						break;
					}
			for(int i=1; i<=12; i++){
				for(int j=1; j<=12; j++)
					map[i][j]=st.charAt(j-1)-'0';
				st = sc.readLine();
				}
			for(int i=1; i<=12; i++)
				for(int j=1; j<=12; j++)
					if(map[i][j]!=0){
						count++;
						erase(map, i, j);
						}
			System.out.println(count);
			}
		}catch(Exception e){
			System.out.println("Error");
			}
		}
	private static void erase(int[][] map, int i, int j){
		if(map[i][j]==0)
			return;
		map[i][j]=0;
		erase(map,i,j+1);
		erase(map,i+1,j);
		erase(map,i-1,j);
		erase(map,i,j-1);
		}
}