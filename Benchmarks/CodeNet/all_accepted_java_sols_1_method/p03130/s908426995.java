import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		//int answer=0;
		String answer="NO";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		//int ai=0;
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[4];
		for(int i=0;i<4;i++)
		{
			c[i]=0;
		}
		int max=0;
		int min=0;
		int sum=0;
		//int sub=0;
		//int a=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		//ai=sc.nextInt();
		//X=sc.nextDouble();
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		//String S=sc.next();
		
		//処理
		for(int i=0;i<3;i++)
		{
			if(a[i]==1)
			{
				c[0]++;
			}
			else if(a[i]==2)
			{
				c[1]++;
			}
			else if(a[i]==3)
			{
				c[2]++;
			}
			else if(a[i]==4)
			{
				c[3]++;
			}
			//
			if(b[i]==1)
			{
				c[0]++;
			}
			else if(b[i]==2)
			{
				c[1]++;
			}
			else if(b[i]==3)
			{
				c[2]++;
			}
			else if(b[i]==4)
			{
				c[3]++;
			}
		}
		//System.out.println(Arrays.toString(c));
		
		for(int i=0;i<4;i++)
		{
			if(c[i]==2)
			{
				count++;
			}
		}
		//System.out.println(count);
		if(count==2)
		{
			answer="YES";
		}
		// 出力
		//System.out.println(Arrays.toString(X))
		//System.out.println(Arrays.deepToString(td));
		System.out.println(answer);
	}
}