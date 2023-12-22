import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		System.out.println((int)Math.ceil((double)h/a));
		sc.close();
	}
}