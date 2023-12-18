import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		s = s.replaceAll("2017", "2018");

		System.out.println(s);
	}

}