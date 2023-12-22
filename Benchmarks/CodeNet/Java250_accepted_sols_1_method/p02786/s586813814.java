import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();

		long ans = 0;
		long multi = 1;
		for(int i = 1; h >= 1; i++) {
			ans += multi;
			multi *= 2;
			h /= 2;
		}

		System.out.println(ans);

	}

}