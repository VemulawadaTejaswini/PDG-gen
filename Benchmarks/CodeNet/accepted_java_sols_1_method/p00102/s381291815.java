import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
				int n = Integer.valueOf(sc.readLine());
				if(n==0)
					break;
				int[][] map = new int[n+1][n+1];
				for(int i=0; i<n; i++){
					String[] st = sc.readLine().split(" ");
					for(int j=0; j<n; j++){
						map[i][j] = Integer.valueOf(st[j]);
						map[i][n] += map[i][j];
						map[n][j] += map[i][j];
					}
				map[n][n] += map[i][n];
				}
				for(int i=0; i<=n; i++){
					for(int j=0; j<n; j++)
						System.out.printf("%5d", map[i][j]);
					System.out.printf("%5d\n",map[i][n]);
				}
			}
		}catch(Exception e){
			System.out.println("Error");
			}
		}
}