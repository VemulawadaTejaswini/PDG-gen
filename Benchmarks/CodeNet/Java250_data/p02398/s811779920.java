import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;
		for (int i = a; b >= i; i++) {
			if (c % i == 0) {
				x++;
			}
		}
		System.out.println(x);

	}

}