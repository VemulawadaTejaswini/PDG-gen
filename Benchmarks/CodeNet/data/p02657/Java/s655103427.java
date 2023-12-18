import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		prtln(A * B);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}