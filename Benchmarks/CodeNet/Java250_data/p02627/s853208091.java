import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String up = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String a = sc.next();
		if(up.indexOf(a) >= 0) {
			System.out.println("A");
		}else {

			System.out.println("a");
		}
	}

}