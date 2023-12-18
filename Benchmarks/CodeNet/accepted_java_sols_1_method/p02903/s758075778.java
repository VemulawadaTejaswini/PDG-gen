import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		sc.close();

		StringBuilder zeroSB = new StringBuilder();
		StringBuilder oneSB = new StringBuilder();

		for(int i = 1;i <= A;i++) {
			zeroSB.append("0");
			oneSB.append("1");
		}
		String zeroA = zeroSB.toString();
		String oneA = oneSB.toString();
		for(int i = A + 1;i <= W - A;i++) {
			zeroSB.append("0");
			oneSB.append("1");
		}
		String zeroWmA = zeroSB.toString();
		String oneWmA = oneSB.toString();

//		System.out.println(zeroA);
//		System.out.println(oneA);
//		System.out.println(zeroWmA);
//		System.out.println(oneWmA);

		for(int tate = 1;tate <= B;tate++) {
			System.out.print(zeroA);
			System.out.println(oneWmA);
		}
		for(int tate = B + 1;tate <= H;tate++) {
			System.out.print(oneA);
			System.out.println(zeroWmA);
		}

	}
}