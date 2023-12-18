import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((int) Math.ceil(Math.log10(n) / Math.log10(3)));
		sc.close();
	}
}