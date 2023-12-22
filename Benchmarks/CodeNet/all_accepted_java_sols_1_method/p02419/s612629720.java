
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String W = sc.next();

		int count = 0;

		while (sc.hasNext()) {
			String T = sc.next().toLowerCase();;

			if (T.equals("END_OF_TEXT")) {
				break;
			}
			if (T.equals(W)) {
				count++;
			}
		}


		System.out.println(count);
	}
}

