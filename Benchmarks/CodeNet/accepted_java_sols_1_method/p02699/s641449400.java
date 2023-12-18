import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int S=stdIn.nextInt();
		int W=stdIn.nextInt();
		if(S<=W)
			System.out.println("unsafe");
		else
			System.out.println("safe");
	}
}
