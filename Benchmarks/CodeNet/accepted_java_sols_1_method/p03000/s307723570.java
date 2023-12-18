import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	static int[][] map;
	static long[][] dp;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		int ans = 0;
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int[] L = new int[N];
		int x = 0;
		int count = 1;
		for(int i=0; i<N; i++){
			x += Integer.parseInt(sc.next());
			if(x<=X)count++;
		}
		
		System.out.println(count);
		
	}
}

