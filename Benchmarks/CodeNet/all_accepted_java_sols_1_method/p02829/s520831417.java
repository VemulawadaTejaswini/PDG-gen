import java.util.Scanner;

//AtCoder Beginner Contest 148
//A - Round One
public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		if (A == 1 && B == 2) {
			System.out.println(3);
		} else if (A == 1 && B == 3) {
			System.out.println(2);
		} else if (A == 2 && B == 3) {
			System.out.println(1);
		} else if (A == 2 && B == 1) {
			System.out.println(3);
		} else if (A == 3 && B == 1) {
			System.out.println(2);
		} else if (A == 3 && B == 2) {
			System.out.println(1);
		}
	}
}
