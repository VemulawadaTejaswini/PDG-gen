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
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int L=0;
		//int sub=0;
		int a=0;
		int b=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		//X=sc.nextDouble();
		//int A[]=new int[L];
		//for(int i=0;i<L;i++)
		//{
		//	A[i]=sc.nextInt();
		//}
		//String S=sc.next();
		
		//処理
		if(b%a==0)
		{
			answer=a+b;
		}else
		{
			answer=b-a;
		}
		// 出力
		//System.out.println(Arrays.toString(X))
		//System.out.println(Arrays.deepToString(td));
		System.out.println(answer);
	}
}