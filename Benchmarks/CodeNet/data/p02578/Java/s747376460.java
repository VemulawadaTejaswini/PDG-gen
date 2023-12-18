//package abc176;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] ip = br.readLine().split(" ");
		int[] ary = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			ary[i] = Integer.parseInt(ip[i]);
		}
		
		int prev = ary[0];
		long ans = 0;
		
		for(int i = 1 ; i < N ; i++) {
			if(prev > ary[i]) {
				ans += Math.abs(prev-ary[i]);
				ary[i] += Math.abs(prev-ary[i]);
			}
			prev = Math.max(ary[i], prev);
		}
		
		System.out.println(ans);
	}
	
}
