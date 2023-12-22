import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] A = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
			sum += A[i];
		}
		int judge = sum/(4*M);
		boolean judgeF = true;
		if(sum%(4*M)>0) {
			judgeF = false;
		}
		Arrays.sort(A);
		String result = "Yes";
		int count = 0;

		for(int j=N-1;count<M;j--) {
			if(judgeF){
				if(A[j]<judge) {
					result = "No";
				}
			}else {
				if(A[j]<=judge) {
					result = "No";
				}
			}
			count++;
		}

		System.out.println(result);

	}
}