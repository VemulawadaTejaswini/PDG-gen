import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		String[] inA = br.readLine().split(" ");
		long[] A = new long[N];
		A[0] = Long.parseLong(inA[0]);
		long[] sum = new long[N];
		sum[0] = A[0];
		
		long ans = 0;
		long C = 1000000007;
		for(int i=1; i<inA.length; i++){
		    A[i] = Long.parseLong(inA[i]);
		    sum[i] = (sum[i-1] + A[i])%C;
		}
		
		for(int a1 = 1; a1<N; a1++){
		    ans += A[a1]*sum[a1-1]%C;
		    ans %= C;
		}
		
		System.out.println(ans);
	}
}
