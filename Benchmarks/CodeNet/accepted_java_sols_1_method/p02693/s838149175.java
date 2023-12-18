import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int K=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int key=B/K;
		if(A<=key*K&&key*K<=B)
			System.out.println("OK");
		else
			System.out.println("NG");
	}
}
