import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		if(N*A < B)
		{
			System.out.println(N*A);
		}
		else
		{
			System.out.println(B);
		}

	}

}
