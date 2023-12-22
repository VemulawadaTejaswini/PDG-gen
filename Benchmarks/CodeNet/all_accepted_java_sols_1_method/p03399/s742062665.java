import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int train = a < b ? a : b;

		int c = sc.nextInt();
		int d = sc.nextInt();
		int bus = c < d ? c : d;

		System.out.println(train + bus);
	}
}
