import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int n;
	public static int max;
	public static int A[];
	public static int B[];
	public static int C[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String [] temp = br.readLine().split(" ");
		A = new int[n];
		B = new int[n];
		max = 10000 > n ? n:10000;
		C = new int[max];

		for(int i = 0; i<n ;i++){
			A[i] = Integer.parseInt(temp[i]);
			C[A[i]]++;
		}

		for(int i=1;i<max-1;i++){
			C[i] = C[i-1]+C[i];
		}

		for(int i = n-1;i>=0;i--){
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}
		for(int i = 0; i < n ;i++){
			System.out.print(B[i]+" ");
		}
	}

}