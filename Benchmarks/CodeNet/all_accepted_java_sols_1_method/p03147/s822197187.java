import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		//int count=0;
		//boolean sw=false;
		int answer=0;
		//String answer="NO";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int N=0;
		int v=0;
		int e=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		//入力
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		int h[]=new int[N];
		for(int i=0;i<N;i++)
		{
			h[i]=sc.nextInt();
		}
		//int a=sc.nextInt();
		//String S=sc.next();
		//int [][] cost =new int[N-1][2];
		
		//処理
		for(int i=0;i<N;i++)
		{
			v+=h[i];
		}
		for(int i=1;i<N;i++)
		{
			e+=Math.min(h[i-1],h[i]);
		}
		answer=v-e;
		// 出力
		System.out.println(answer);
	}
}