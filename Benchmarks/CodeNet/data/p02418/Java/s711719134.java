import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		String strInput1 = scanner.nextLine();
		String strInput2 = scanner.nextLine();

		String strLoop = strInput1 + strInput1;

		if (strLoop.contains(strInput2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

