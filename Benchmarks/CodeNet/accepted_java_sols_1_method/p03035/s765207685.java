import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		if(A>=13)
			System.out.println(B);
		else
			if(A>=6)
				System.out.println(B/2);
			else
				System.out.println(0);
	}
}
