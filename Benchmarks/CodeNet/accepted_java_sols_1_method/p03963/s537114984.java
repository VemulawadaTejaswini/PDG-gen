import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		long ans=K;
		if(N!=0)
			ans*=Math.pow(K-1,N-1);
		System.out.println(ans);
	}
}
