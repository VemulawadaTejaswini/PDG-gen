import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int min = 1000;
		for(int i = 1;i < N;i++) {
			int sum = 0;
			char[] A = String.valueOf(i).toCharArray();
			char[] B = String.valueOf(N - i).toCharArray();
			for(int j = 0;j < A.length;j++) {
				sum += Character.getNumericValue(A[j]);
			}
			for(int j = 0;j < B.length;j++) {
				sum += Character.getNumericValue(B[j]);
			}
			if(sum < min) {
				min = sum;
			}
		}
		System.out.println(min);
	}
}