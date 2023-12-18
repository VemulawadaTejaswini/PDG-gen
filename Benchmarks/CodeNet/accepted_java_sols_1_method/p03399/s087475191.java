import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int tm = Math.min(A, B);
		int bm = Math.min(C, D);
		System.out.println(tm+bm);
	}
}

