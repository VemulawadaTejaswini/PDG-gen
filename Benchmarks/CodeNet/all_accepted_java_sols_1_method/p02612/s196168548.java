import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 1000;

		while(n > count) {
			count += 1000;
		}

		System.out.println(count - n);
	}
}
