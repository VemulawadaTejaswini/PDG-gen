import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = b - a;
		int bhight = c*(c + 1)/2;
		System.out.println(bhight - b);
	}
}