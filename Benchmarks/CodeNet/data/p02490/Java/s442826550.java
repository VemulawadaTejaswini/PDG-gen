import java.util.*;

public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0, temp;
		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				a = in.nextInt();
				b = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
			if (a == 0 && b == 0) {
				in.close();
				System.exit(0);
			}
			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}
			System.out.println(a + " " + b);
		}
	}
}