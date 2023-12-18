import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int N = stdIn.nextInt();

		if(N % 2 == 0)
		{
			System.out.println(N);
		}
		else
		{
			System.out.println(N*2);
		}

	}

}
