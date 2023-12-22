import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		//long answer=0;
		//double answer=0;
		//String answer="NO";
		List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int L=0;
		//int sub=0;
		int n=0;
		int m=0;
		int c[]=new int[31];
		for(int i=0;i<31;i++)
		{
			c[i]=0;
		}
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		//X=sc.nextDouble();
		int a[][]=new int[n][m];
		int k[]=new int[n];
		for(int i=0;i<n;i++)
		{
			k[i]=sc.nextInt();
			for(int j=0;j<k[i];j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//int A[]=new int[L];
		//for(int i=0;i<L;i++)
		//{
		//	A[i]=sc.nextInt();
		//}
		//String S=sc.next();
		
		//処理
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k[i];j++)
			{
				c[a[i][j]]+=1;
			}
		}
		for(int i=0;i<31;i++)
		{
			if(c[i]==n)
			{
				answer++;
			}
		}
		// 出力
		//System.out.println(Arrays.toString(X))
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(h.toArray()));
		System.out.println(answer);
	}
}