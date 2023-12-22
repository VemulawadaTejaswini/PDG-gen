import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int ans=0;
		for(int i=105;i<=N;i+=2){
			int a=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					a++;
			}
			if(a==8)
				ans++;
		}
		System.out.println(ans);
	}
}
