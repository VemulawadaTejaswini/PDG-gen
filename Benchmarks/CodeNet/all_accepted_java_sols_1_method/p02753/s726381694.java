import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		if(S.equals("AAA")||S.equals("BBB"))
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
