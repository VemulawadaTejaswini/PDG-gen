import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble()) {
			double ans_num = sc.nextDouble();
			double sum = ans_num; // S(1)
			sum += ans_num * 2; // S(2)
			// S(3)??\???
			for (int i = 3; i <= 10; i++) {
				if (i % 2 == 0) {
					ans_num = ans_num * 2;
					sum += ans_num;
				} else {
					ans_num = ans_num / 3;
					sum += ans_num;
				}
			}
			
			System.out.println(sum);
		}
		sc.close();
	}
}