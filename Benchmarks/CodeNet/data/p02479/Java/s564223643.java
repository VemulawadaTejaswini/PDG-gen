import java.util.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.printf("%.6f %.6f\n", (Math.PI * r * r), (2 * Math.PI * r));
	}
}