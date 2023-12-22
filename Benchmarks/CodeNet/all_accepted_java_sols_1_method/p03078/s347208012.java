import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();

		long[] A = new long[X+1];
		long[] B = new long[Y+1];
		long[] C = new long[Z+1];

		for(int i = 1 ; i <= X ; i++){
			A[i] = sc.nextLong();
		}
		for(int i = 1 ; i <= Y ; i++){
			B[i] = sc.nextLong();
		}
		for(int i = 1 ; i <= Z ; i++){
			C[i] = sc.nextLong();
		}
		sc.close();

		long[] ANS = new long[1000000];

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		int count = 0;
		for(int i = 1 ; i <= X ; i++){
			for(int j = 1 ; j <= Y ; j++){
				for(int k = 1 ; k <= Z ; k++){

					if(i*j*k <= 3000){
						ANS[count] = A[X+1-i]+B[Y+1-j]+C[Z+1-k];
						count++;
					}
					else{
						break;
					}
				}
			}
		}

		Arrays.sort(ANS);
		int p = ANS.length;

		for(int i = 0 ; i < K; i++){
			System.out.println(ANS[p-i-1]);
		}

	}
}