import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double total = 0;
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			double money = sc.nextDouble();
			String jb = sc.next();
			if (jb.equals("JPY")) {
				total += money;
			} else {
				total += money * 380000;
			}

		}
		System.out.println(total);
	}

}
