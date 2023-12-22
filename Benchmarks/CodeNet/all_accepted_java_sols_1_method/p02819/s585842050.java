import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for (int i=X; ; i++) {
			boolean ch = false;
			for (int j=2; j<=X/2; j++) {
				if (i%j == 0) {
					ch = true;
					break;
				}
			}
			if (!ch) {
				System.out.println(i);
				break;
			}
		}
	}
}