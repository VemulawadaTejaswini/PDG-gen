import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		// ケーキを買う
		X -= A;
		
		int count = 0;
		
		while(X >= B) {
			X -= B;
			count++;
		}
		
		System.out.println(X);
		
	}
}