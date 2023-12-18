import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		String answer="";
		int e=0;
		int f=0;
		int g=0;
		int h=0;
		//List<Integer> hb=new ArrayList<Integer>();
		//long a=0;
		//int af=Integer.MAX_VALUE;
		//入力
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		//int [][] cost =new int[N-1][2];
		//処理
		if(a==1 || b==1 || c==1 || d==1)
		{
			e=1;
		}
		if(a==9 || b==9 || c==9 || d==9)
		{
			f=1;
		}
		if(a==7 || b==7 || c==7 || d==7)
		{
			g=1;
		}
		if(a==4 || b==4 || c==4 || d==4)
		{
			h=1;
		}
		//
		if(e==1 && f==1 && g==1 && h==1)
		{
			answer="YES";
		}else
		{
			answer="NO";
		}
		// 出力
		System.out.println(answer);
	}
}