import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int N = stdIn.nextInt();
		int K = stdIn.nextInt();

		if(N%K == 0)
		{
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}



	}

}
