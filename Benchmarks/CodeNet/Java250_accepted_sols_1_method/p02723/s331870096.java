import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		if(S.charAt(4)==S.charAt(5) && S.charAt(2)==S.charAt(3))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
