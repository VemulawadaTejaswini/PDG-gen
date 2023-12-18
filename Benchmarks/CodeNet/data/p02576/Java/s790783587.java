import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int t = scan.nextInt();
		
		int ans = 0;
		int a = n/x;
		int b = n%x;
		
		
		if(b == 0) {
			System.out.println(a*t);
		}
		else {
			System.out.println(a*t+t);
		}
	}

}
