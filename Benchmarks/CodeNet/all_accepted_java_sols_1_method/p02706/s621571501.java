import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int r = 0;
		for (int i =0;i<m;i++) r += sc.nextInt();
		if (n >= r)
		System.out.println(n - r);
		else System.out.println(-1);
	}
}
