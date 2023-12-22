import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String Date1 = "2019/04/30";
		String Date2;
		String ans = "Heisei";
		Scanner sc = new Scanner(System.in);

		Date2 = sc.nextLine();

		if(Date1.compareTo(Date2) < 0) {
			ans = "TBD";
		}

		System.out.println(ans);

		sc.close();
	}
}