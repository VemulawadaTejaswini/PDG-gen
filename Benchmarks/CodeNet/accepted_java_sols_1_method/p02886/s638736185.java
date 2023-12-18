
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] word = br.readLine().split("\\s+");
		long[] A = new long[N];
		for(int i=0;i<N;i++){
			A[i] = Long.parseLong(word[i]);
		}
		long sum   = 0;
		for( int  i = 0;i<N;i++){
			for(int j=i+1;j<N;j++){
				sum += A[i] * A[j];
			}
		}
		System.out.println(sum);
		
	}
}