import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(n>=k) {
		System.out.println(x*k + (n-k)*y);
	}else {
	System.out.println(n*x);

	}
	}
}
