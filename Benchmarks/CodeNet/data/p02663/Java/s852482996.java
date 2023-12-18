import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h1 = scan.nextInt();
		int m1 = scan.nextInt();
		int h2 = scan.nextInt();
		int m2 = scan.nextInt();
		int k = scan.nextInt();
		int time = 0;

		if(m1 <= m2) {
			time += (h2 - h1) * 60 + (m2 - m1);
			time -= k;
		}else {
			time += ((h2 - h1) * 60) - (m1 - m2);
			time -= k;
		}

		System.out.println(time);
	}
}
