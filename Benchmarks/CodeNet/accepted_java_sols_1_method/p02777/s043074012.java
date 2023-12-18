import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		String T=stdIn.next();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		String U=stdIn.next();
		if(U.equals(S))
			System.out.println((A-1)+" "+B);
		else
			System.out.println(A+" "+(B-1));
	}
}
