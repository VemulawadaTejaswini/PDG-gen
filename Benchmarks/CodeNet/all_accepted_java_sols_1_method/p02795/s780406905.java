import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt(), w = s.nextInt();
		int n = s.nextInt();
		int z = Math.max(h, w);
		System.out.println((n - 1) / z + 1);

	}
}
