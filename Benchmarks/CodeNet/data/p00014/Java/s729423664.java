import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int sum = 0;
			int d = sc.nextInt();
			for (int i = 1; d * i <= 600 - d; i++)
				sum += (d * i) * (d * i) * d;
			System.out.println(sum);
		}

	}

}