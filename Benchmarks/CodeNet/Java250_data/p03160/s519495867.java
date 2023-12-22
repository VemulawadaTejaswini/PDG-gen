import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Reader rd = new Reader();
		int n = rd.nextInt();
		int[] h = new int[n+1];
		h[0] = 0;
		for(int i=1; i<=n; i++){
			h[i] = rd.nextInt();
		}
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = Math.abs(h[2] - h[1]);
		for(int i=3; i<=n; i++){
			dp[i] = (int)Math.min(dp[i-1] + Math.abs(h[i] - h[i-1]) , dp[i-2] + Math.abs(h[i]-h[i-2]));
		}
		//System.out.println(Arrays.toString(h));
		//System.out.println(Arrays.toString(dp));
		System.out.println(dp[n]);
	}

	static void sort(int[] ar){
		ArrayList<Integer> ls = new ArrayList<>();
		for(int i=0; i<ar.length; i++) ls.add(ar[i]);
		Collections.sort(ls);
		for(int i =0; i<ls.size(); i++) ar[i] = ls.get(i);
	}
}

class Reader { 
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tok = new StringTokenizer("");
	static String next() {
		while(!tok.hasMoreTokens()){
			try{
				tok = new StringTokenizer(bf.readLine());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return tok.nextToken();
	} 
	static int nextInt() {
		return Integer.parseInt(next());
	}
}
