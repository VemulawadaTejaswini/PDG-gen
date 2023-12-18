import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] Ain = br.readLine().split(" ");
		int[]A = new int[N+1];
		for(int a=0;a<N;a++) {
			A[a+1] = Integer.parseInt(Ain[a]);
		}
		
		int[]done = new int[N+1];
		
		int count = 0;
		for(int i = 1;i<N+1;i++) {
			if(done[i] == 0) {
				done[i] = 1;
				if(i == A[A[i]]) {
					count++;
					done[A[i]] = 1;
				}
			}
		}
		
		System.out.println(count);	
	}
}
