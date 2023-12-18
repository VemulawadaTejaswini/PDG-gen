import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		int count2=0;
		boolean sw=false;
		String answer="";
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String s=sc.next();
		//List<Integer> A=new ArrayList<Integer>();
		//Arrays.sort(a,(x,y) -> Long.compare(x[0], y[0]));
		//処理
		for(int i=0;i<N;i++)
		{
			String ss=s.substring(i,i+1);
			if(ss.equals("R"))
			{
				count++;
			}else
			{
				count2++;
			}
		}
		if(count>count2)
		{
			answer="Yes";
		}else
		{
			answer="No";
		}
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		System.out.println(answer);
	}
}