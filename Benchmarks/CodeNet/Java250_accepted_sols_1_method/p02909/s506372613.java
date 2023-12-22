import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		//System.out.println(a);
		if (a.equals("Sunny")) {
			System.out.println("Cloudy");
		} else if (a.equals("Cloudy")) {
			System.out.println("Rainy");
		} else if (a.equals("Rainy")) {
			System.out.println("Sunny");
		}
	}

}
