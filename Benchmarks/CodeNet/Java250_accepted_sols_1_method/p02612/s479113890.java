import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int a = N%1000;
		if(a == 0) {
			System.out.println("0");
		}else {
			int b = 1000-a;
			System.out.println(b);
		}
	}

}
