import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int p = in.nextInt();
		int q = in.nextInt();
		int r = in.nextInt();

		int max = 0;
		if ( p >= q && p >= r ) max = p;
		if ( q >= p && q >= r ) max = q;
		if ( r >= q && r >= p ) max = r;

		System.out.println(p + q + r - max);
		in.close();
	}
}