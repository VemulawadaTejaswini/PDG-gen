import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static int n;
	public static int A[];
	public static int B[];
	public static int C[] = new int[10000];
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		A = new int[n];
		B = new int[n];

		for(int i = 0; i<n ;i++){
			A[i] = scan.nextInt();
			C[A[i]]++;
		}

		for(int i=1;i<10000;i++){
			C[i] = C[i-1]+C[i];
		}

		for(int i = n-1;i>=0;i--){
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}

		for(int i = 0; i < n-1 ;i++){
			sb.append(B[i]+" ");
		}
		System.out.println(sb.toString()+B[n-1]);

	}

}