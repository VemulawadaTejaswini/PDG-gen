import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A, B;
		int min,max;
		A = new int[2];
		B = new int[2];
		for(int i = 0; i < 2; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++) {
			B[i] = sc.nextInt();
		}

		if(A[1] <= B[0] || B[1] <= A[0]) {
			System.out.println(0);
			System.exit(0);
		}

		if(A[0] < B[0]) {
			min = B[0];
		}else {
			min = A[0];
		}

		if(A[1] < B[1]) {
			max = A[1];
		}else {
			max = B[1];
		}

		System.out.println(max - min);
		sc.close();
	}
}
