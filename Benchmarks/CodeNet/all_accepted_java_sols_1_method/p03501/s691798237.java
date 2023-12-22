import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int price = n * a;
		if(price > b) {
			price = b;
		}
		System.out.println(price);
	}
}