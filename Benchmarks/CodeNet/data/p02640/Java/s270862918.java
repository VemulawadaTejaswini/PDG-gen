import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int a = x / 3;
		int b = y / 8;
		
		int c = 2*x /3;
		int d = y / 4;
		
		if(a == b || c == d) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		
	}

}
