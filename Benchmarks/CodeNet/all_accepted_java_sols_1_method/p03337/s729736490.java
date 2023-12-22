import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();
		int y = stdIn.nextInt();

		int max = x + y;

		if(x - y > max)
		{
			max = x - y;
		}
		if(x * y > max)
		{
			max = x * y;
		}

		System.out.println(max);

	}

}
