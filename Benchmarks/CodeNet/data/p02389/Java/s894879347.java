import java.io.*;
class Main
{
	static int menseki(int a,int b)
	{
		int sum;
		sum=a*b;
		return sum;
		
	}
	static int mawari(int a,int b)
	{
		int sum;
		sum=(a*2)+(b*2);
		return sum;
		
	}
	
	public static void main(String[] args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		int b;
		int menseki;
		int mawari;
		
		System.out.print("a");
		a=Integer.parseInt(br.readLine());
		System.out.print("b");
		b=Integer.parseInt(br.readLine());
		System.out.print(menseki(a,b));
		System.out.print(" ");
		System.out.print(mawari(a,b));
		
	
		
	}
}