import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int R1 = scan.nextInt();
		int R2 = scan.nextInt();

		int gap = R2 - R1;
		int min = Math.min(R1, R2);
		for (int i = 2; i < n; i++) {
			int R = scan.nextInt();
			if (R - min > gap)
				gap = R - min;
			if (R < min)
				min = R;
		}
		System.out.println(gap);
		
		scan.close();
		System.exit(0);
	}

}