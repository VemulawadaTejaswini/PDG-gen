import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 1000 == 0) {
			System.out.print(0);
		}else {
			System.out.print(n%1000);
		}
	}

}
