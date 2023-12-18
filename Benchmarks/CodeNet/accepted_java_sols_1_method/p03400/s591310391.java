import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();
		int X=sc.nextInt();
		int ans=X;

		for(int i=0;i<N;i++){
			int A=sc.nextInt();
			ans+=((D-1)/A)+1;
		}

		//結果を出力
		System.out.println(ans);
	}
} 