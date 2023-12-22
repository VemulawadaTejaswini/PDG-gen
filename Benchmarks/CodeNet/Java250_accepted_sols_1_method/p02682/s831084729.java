import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String str[]=s.split(" ");
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		int c=Integer.parseInt(str[2]);
		int k=Integer.parseInt(str[3]);
		if(a>=k)
			System.out.println(k);
		else if((a+b)>=k)
			System.out.println(a);
		else
		{
			int temp=k-(a+b);
			System.out.println(a-temp);
		}
	}
}
