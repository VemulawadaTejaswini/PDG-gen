import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String N=stdIn.next();
		if(N.indexOf("7")!=-1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
