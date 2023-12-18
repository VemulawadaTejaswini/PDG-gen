import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		
		if(N / 100 == N % 10)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
