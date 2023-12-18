import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] count = line.split(" ");
		int a = Integer.parseInt(count[0]);
		int b = Integer.parseInt(count[1]);
		int c = Integer.parseInt(count[2]);

		int n = 0;

		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				n++;
			}
		}
		System.out.println(n);

	}

}
