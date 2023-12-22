import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		String s = stdIn.next();

		int num = 0;

		for(int i = 0; i < 4; i++)
		{
			if(s.charAt(i) == '+')
			{
				num++;
			}
			else
			{
				num--;
			}
		}

		System.out.println(num);

	}

}
