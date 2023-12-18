import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int time = sc1.nextInt();

		int hh = time / 3600;
		time = time % 3600;
		int mm = time / 60;
		int ss = time % 60;

		System.out.println(hh + ":" + mm + ":" + ss);

		sc1.close();

	}

}
