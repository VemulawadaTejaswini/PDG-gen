import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int A=stdIn.nextInt();
		if(H%A==0)
			System.out.println(H/A);
		else
			System.out.println(H/A+1);
	}
}
