import java.util.Scanner;

public class Main {
	public static int euclidean(int x, int y) {
		int result = -1, z = 1;
		while (z > 0) {
			z = x % y;
			if (z == 0) result = y;
			x = y; y = z;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (y > x ) {
			int tmp = x; x = y; y = tmp;
		}
		int factor = euclidean(x, y);
		if (factor == -1) {
			System.out.println("not exist Greatest common factor");
		} else {
			System.out.println(euclidean(x, y));
		}
	}
}

