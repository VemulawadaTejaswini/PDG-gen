import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long a = in.nextInt();
		long b = in.nextInt();
		long c = in.nextInt();
		long d = in.nextInt();
		long xy = a * c;
		xy = Math.max(xy, a * d);
		xy = Math.max(xy, b * c);
		xy = Math.max(xy, b * d);
		System.out.println(xy);
	}

}
