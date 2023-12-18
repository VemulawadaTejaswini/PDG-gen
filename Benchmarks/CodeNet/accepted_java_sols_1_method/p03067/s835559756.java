
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());//int型
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		sc.close();
		if ((a < c && c < b) || (b < c && c < a)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
