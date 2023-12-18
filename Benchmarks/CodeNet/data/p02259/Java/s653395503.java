import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextInt();
		}

		boolean flag = true;
		int swap = 0;
		while(flag) {
			flag = false;
			for(int i = N-1;i >0;i--) {
				if(A[i-1] > A[i]) {
					int buf = A[i];
					A[i] = A[i-1];
					A[i-1] = buf;
					flag = true;
					swap++;
				}
			}
		}
		printArray(A);
		System.out.println(swap);

	}
	public static void printArray(int[] A) {
		for(int i = 0;i < A.length;i++) {
			System.out.print(((i==0)?"":" ") + A[i] + ((i==A.length-1)?"\n":""));
		}
	}

}

