import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		prtln(a + (a * a) + (a * a * a));
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
