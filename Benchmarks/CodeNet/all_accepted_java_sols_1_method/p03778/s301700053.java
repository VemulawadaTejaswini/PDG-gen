import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(Math.abs(a - b) <= W) {
			System.out.print(0);
		}
		else {
			System.out.print(Math.abs(a - b) - W);
		}
	}

}
