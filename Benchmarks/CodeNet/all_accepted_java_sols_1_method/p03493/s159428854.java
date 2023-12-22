import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		str = str.replaceAll("0", "");
		System.out.println(str.length());
	}

}
