import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long[] A = new long[N];
		long ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)
			A[i] = Long.parseLong(st.nextToken());
		
		for(int i=1; i<N; i++) {
			if(A[i-1] > A[i]) {
				ans += A[i-1] - A[i];
				A[i] = A[i-1];
			}
		}
		System.out.println(ans);
	}

}