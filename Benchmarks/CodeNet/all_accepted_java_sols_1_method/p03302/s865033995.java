import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a*b == 15 ) {
			System.out.println('*');
		}else if(a+b ==15) {
			System.out.println('+');
		}else {
			System.out.println('x');
		}
	}

}