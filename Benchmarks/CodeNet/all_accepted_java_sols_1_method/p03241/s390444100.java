import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int g = m/n;
		while (m%g!=0) g--;
		System.out.println(g);
	}
}