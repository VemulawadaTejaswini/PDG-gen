import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int or = n;
		int total = 0;
		while (n > 0) {
			total += n % 10;
			n /= 10;
		}
		if (or % total == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
