import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		
		if((c1 == s.charAt(1) && c1 == s.charAt(2)) || (c2 == s.charAt(2) && c2 == s.charAt(3)))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
