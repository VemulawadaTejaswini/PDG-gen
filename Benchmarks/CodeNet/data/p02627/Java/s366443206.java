
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//コンソールに入力した値を取得
		String a = sc.next();

		if(a.matches("[A-Z]+")) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
		sc.close();
	}
}
