import java.util.Scanner;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner cd = new Scanner(System.in);
		int a = cd.nextInt();
		int b = cd.nextInt();
		String s = cd.next();
		if(s.matches("[0-9]{"+a+"}-[0-9]{"+b+"}")) {
			System.out.println("Yes");
		}else System.out.println("No");
	}

}
