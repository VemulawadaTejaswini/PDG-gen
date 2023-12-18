import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		int sum=0;
		List<Integer> h=new ArrayList<Integer>();
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int C=sc.nextInt();
		int A[][]=new int[N][M];
		List<Integer> B=new ArrayList<Integer>();
		for(int i=0;i<M;i++)
		{
			B.add(sc.nextInt());
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		
		//処理
		while(sw==false)
		{
			for(int i=0;i<M;i++)
			{
				h.add(A[count][i]);
			}
			for(int i=0;i<M;i++)
			{
				int x=B.get(i);
				int y=h.get(i);
				sum+=x*y;
			}
			sum+=C;
			if(sum>0)
			{
				answer++;
			}
			h.clear();
			sum=0;
			count++;
			if(count==N)
			{
				sw=true;
			}
		}
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		//System.out.println("-------------------");
		System.out.println(answer);
	}
}