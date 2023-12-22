import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long yokin = 100;
		// 目標金額
		long purpose = sc.nextLong();
		// 経過年度
		int year = 0;

		while(true) {
			if(yokin >= purpose) {
				System.out.println(year);
				break;
			}

			yokin = (long) (yokin * 1.01);
			year++;
		}

		sc.close();
	}


}
