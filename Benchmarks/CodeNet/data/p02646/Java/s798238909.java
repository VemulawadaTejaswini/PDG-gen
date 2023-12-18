import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		sc.close();
		// T秒後のAの位置
		long posA = A + (T * V);
		// T秒後のBの位置
		long posB = B + (T * W);
		// prtln(posA + " " + posB);
		// 捕まえられたらYES
		prtln(posA >= posB ? "YES" : "NO");
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}