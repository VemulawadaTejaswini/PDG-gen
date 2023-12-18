import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int M=stdIn.nextInt();
		int h=stdIn.nextInt();
		int m=stdIn.nextInt();
		int K=stdIn.nextInt();
		int a=H*60+M,b=h*60+m;
		System.out.println(b-K-a);
	}
}
