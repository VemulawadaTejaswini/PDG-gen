import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		//int count=0;
		boolean sw=false;
		int answer=0;
		//String answer="NO";
		List<Integer> a=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int s;
		int n=1;
		int ai=0;
		int count=0;
		//入力
		Scanner sc = new Scanner(System.in);
		s=sc.nextInt();
		//int a=sc.nextInt();
		//String S=sc.next();
		//int [][] cost =new int[N-1][2];
		
		//処理
		while(sw==false)
		{
			if(count==0)
			{
				a.add(s);
				count++;
			}else
			{
				n=a.get(count-1);
				if(n%2==0)
				{
					ai=n/2;
					a.add(ai);
				}else
				{
					ai=3*n+1;
					a.add(ai);
				}
				//System.out.println("ai="+ai);
				count++;
			}
			for(int i=0;i<count-1;i++)
			{
				if(a.get(i)==ai)
				{
					answer=a.size();
					sw=true;
				}
			}
			//System.out.println(count);
			//System.out.println(Arrays.toString(a.toArray()));
			//if(count==10)
			//{
			//	sw=true;
			//}
		}
		//System.out.println(Arrays.toString(a.toArray()));
		// 出力
		System.out.println(answer);
	}
}