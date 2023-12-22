import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			System.out.printf("%d %d\n", Math.min(a, b), Math.max(a, b));
			
		}
		
	}

}

