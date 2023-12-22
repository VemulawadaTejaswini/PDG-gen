import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c1 = sc.next();
		String c2 = sc.next();

		String c1_reverse = new StringBuffer(c1).reverse().toString();
		String c2_reverse = new StringBuffer(c2).reverse().toString();

		if (c1.equals(c2_reverse) && c2.equals(c1_reverse)){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}