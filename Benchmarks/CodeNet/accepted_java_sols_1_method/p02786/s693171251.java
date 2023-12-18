import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long count = 0;
		long num = 1;

		while(h >= 1) {
			h = h / 2;
			count += num;
			num *= 2;
		}

		System.out.println(count);

	}

}
