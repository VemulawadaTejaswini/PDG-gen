import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int ans=0;
		for(int i=0;i<N;i++){
			int a=stdIn.nextInt();
			if(a>=K)
				ans++;
		}
		System.out.println(ans);
	}
}
