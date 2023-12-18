import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		sc.close();
		prtln((long)Math.floor(A * B));
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}