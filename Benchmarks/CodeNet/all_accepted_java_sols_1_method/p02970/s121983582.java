import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int D=stdIn.nextInt();
		int ans=N/(D*2+1);
		if(N%(D*2+1)!=0)
			ans++;
		System.out.println(ans);
	}
}