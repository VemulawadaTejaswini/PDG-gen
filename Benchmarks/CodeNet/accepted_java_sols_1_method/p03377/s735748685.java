import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int X = stdIn.nextInt();
		
		if(A <= X && X <= (A+B))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
