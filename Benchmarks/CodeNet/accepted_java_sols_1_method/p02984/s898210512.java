import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]A = new int[N];

		int[] rain = new int[N];
		for (int i=0; i<N; i++){
			A[i] = sc.nextInt();
			if (i % 2 ==0) {
				rain[0] += A[i];
			} else {
				rain[0] -= A[i];
			}
		}
		for (int i=1; i<N; i++) {
			rain[i] = 2 * (A[i-1] - (rain[i-1] /2));
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<N; i++) {
			if (i > 0){
				sb.append(" ");
			}
			sb.append(rain[i]);
		}
		System.out.println(sb.toString());
	}


}