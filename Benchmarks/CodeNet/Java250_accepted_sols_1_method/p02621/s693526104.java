import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int ans = a+a*a+a*a*a;
		
		System.out.print(ans);
	}

}
