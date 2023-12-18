import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		String[] inA = br.readLine().split(" ");
		long[] A = new long[inA.length];
		for(int i=0; i<inA.length; i++){
		    A[i] = Long.parseLong(inA[i]);
		}
		
		long ans = 0;
		long C = 1000000007;
		
		for(int a1 = 0; a1<N-1; a1++){
		    for(int a2 = a1+1; a2<N; a2++){
		        ans = (A[a1]*A[a2]%C + ans)%C;
		    }
		}
		
		System.out.println(ans);
	}
}
