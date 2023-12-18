import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int dp[] = new int[N];
        
        for(int i = 1; i < N; i++) {
        	for(int j = i + 1 ; j <= N; j++) {
        		int normal = j - i;
        		int warp = Math.abs(X - i) + 1 + Math.abs(Y - j);
        		int cost = normal > warp ? warp : normal;
        		
        		dp[cost] ++;
        	}
        }
        
        for(int i = 1 ; i< N ; i++)
        	System.out.println(dp[i]);
	}
}
