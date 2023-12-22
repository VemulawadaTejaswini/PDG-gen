import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		boolean judge = false;
		
		while(true) {
			c -= b;
			if(c <= 0 ) {
				judge = true;
				break;
			}
			
			a -= d;
			if(a <= 0 ) {
				judge = false;
				break;
			}
		}
		
		if( judge == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
