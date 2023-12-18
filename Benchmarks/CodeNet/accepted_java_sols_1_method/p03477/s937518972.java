import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int D = stdIn.nextInt();
		
		if((A+B) > (C+D))
		{
			System.out.println("Left");
		}
		else if((A+B) < (C+D))
		{
			System.out.println("Right");
		}
		else
		{
			System.out.println("Balanced");
		}

	}

}
