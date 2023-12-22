import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a % 2 == 0) {
			System.out.println(a);
		}else {
			System.out.println(a*2);
		}
	}

}