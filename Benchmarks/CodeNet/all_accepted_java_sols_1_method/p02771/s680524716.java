import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		//3つの数字が同じ場合と３つの数字が違う場合Noと表示
		if (A == B && B == C && C ==A || A != B && B != C && C != A) { 
		System.out.println("No"); 
			} 
		else { 
		System.out.println("Yes"); 
		}

		scanner.close();
	}
}