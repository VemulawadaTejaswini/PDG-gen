import java.util.*;
import java.io.*;

public class Main{
	public static void solve(int n){
		int[][] ans = new int[n][n];
		int[] now = new int[2];
		now[0] = (n+1)/2;
		now[1] = (n-1)/2;
		for(int i = 1; i <= n*n; i++){
			if( now[0] > n-1 ){
				now[0] = 0;
			}
			if( now[1] < 0 ){
				now[1] = n-1;
			}
			if( now[1] > n-1 ){
				now[1] = 0;
			}
			if( ans[now[0]][now[1]] != 0 ){
				now[0]++;
				now[1]--;
				i--;
				continue;
			} else {
				ans[now[0]][now[1]] = i;
				now[0]++;
				now[1]++;
			}
		}
		for(int[] x : ans){
			for(int y : x){
				System.out.printf("%5d", y);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		while( n != 0 ){
			solve(n);
			n = stdIn.nextInt();
		}
	}
}