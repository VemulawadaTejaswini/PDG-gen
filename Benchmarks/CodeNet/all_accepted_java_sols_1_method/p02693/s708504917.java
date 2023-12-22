import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ");
 
		int K = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
 
		int largest = (B / K) * K;
		
		if (A <= largest) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		scanner.close();
     
	}
}