import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] A = sc.next().split("");
		String[] B = sc.next().split("");
		String[] C = sc.next().split("");
		if (A[A.length - 1].equals(B[0]) && B[B.length - 1].equals(C[0]))
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}