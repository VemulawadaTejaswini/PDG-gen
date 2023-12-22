import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextInt();
		long B=stdIn.nextInt();
		long C=stdIn.nextInt();
		if(A%2==0||B%2==0||C%2==0)
			System.out.println(0);
		else
			if(A>=B&&A>=C)
				System.out.println(B*C);
			else
				if(B>=A&&B>=C)
					System.out.println(A*C);
				else
					System.out.println(A*B);
	}
}
