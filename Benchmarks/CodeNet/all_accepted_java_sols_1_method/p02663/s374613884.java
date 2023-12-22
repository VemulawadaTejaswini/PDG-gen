
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int K = sc.nextInt();
		
		int total = 0;
		if (m1 <= m2) {
			total = (h2 - h1)*60 + (m2 - m1);
		} else {
			total = (h2 - h1 - 1)*60 + (m2 + (60 - m1));
		}
		
		System.out.println(total - K);




		sc.close();
	}
}
