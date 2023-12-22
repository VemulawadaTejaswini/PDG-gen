import java.util.*;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		Scanner in = new Scanner(System.in);
		for (int i = 1; ; ++i) {
			try {
				a = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
			if (a == 0) {
				in.close();
				System.exit(0);
			}
			System.out.println("Case " + i + ": " + a);
		}
	}
}