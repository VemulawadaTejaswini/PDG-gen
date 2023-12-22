import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		MyInt mi = new MyInt();

		String longA = mi.makeString(a, b);
		String longB = mi.makeString(b, a);

		if (longA.compareTo(longB) > 0) System.out.println(longB);
		else System.out.println(longA);

		scan.close();
	}
}

class MyInt {
	String makeString(int a, int b) {
		String ans = new String();
		for (int i = 0; i < b; i++)
			ans += a;
		return ans;
	}
}