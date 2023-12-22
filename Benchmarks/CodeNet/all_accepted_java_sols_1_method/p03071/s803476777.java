import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a =new int[3];
		int A = sc.nextInt();
		int B = sc.nextInt();

		int answer =0;

		a[0] = A + (A-1);
		a[1] = A + B;
		a[2] = B + B-1;
		for (int i=0; i<3; i++) {
			answer = Math.max(answer, a[i]);
		}
		System.out.print(answer);
	}

}
