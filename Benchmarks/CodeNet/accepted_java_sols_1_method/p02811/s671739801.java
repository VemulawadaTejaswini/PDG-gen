import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
      
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		int total = 500*K;
		
		System.out.println(total>=X?"Yes":"No");

	}
}