import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int L=in.nextInt();
			int A=in.nextInt(),B=in.nextInt(),C=in.nextInt(),D=in.nextInt();
			int cnt=0;
			for(;;)
			{
				if(A<1&&B<1)
					break;
				A-=C;
				B-=D;
				++cnt;
			}
			System.out.println(L-cnt);
		}
	}
}