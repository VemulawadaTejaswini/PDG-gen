import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int zikan = 0;
		if(a+b>=24) {
			zikan = (a+b)-24;
		}else {
			zikan = a+b;
		}
		System.out.println(zikan);
	}

}
