import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		//List<Integer> hb=new ArrayList<Integer>();
		//long a=0;
		int min=0;
		int midle=0;
		int max=0;
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		//int [] P=new int[N];
		//int [][] cost =new int[N-1][2];
		//処理
		for(int i=0;i<N;i++)
		{
			int P=sc.nextInt();
			if(P<=A)
			{
				min++;
			}
			else if(P>=A+1 && P<=B)
			{
				midle++;
			}
			else if(P>=B+1)
			{
				max++;
			}
		}
		answer=Math.min(Math.min(min,max),midle);
		// 出力
		System.out.println(answer);
	}
}