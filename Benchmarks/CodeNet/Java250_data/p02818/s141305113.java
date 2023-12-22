import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
		long diff_A = Math.min(A, K);
		A -= diff_A;
		K -= diff_A;
		long diff_B = Math.min(B, K);
		B -= diff_B;
		K -= diff_B;
		System.out.println(A + " " + B);
	}
}