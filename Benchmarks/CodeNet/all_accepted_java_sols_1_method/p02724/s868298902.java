import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int cnt=0;
		
		if(x>=500)
		{
			cnt+=1000*(x/500);
			x%=500;
		}
		if(x>=5)
		{
			cnt+=5*(x/5);
			x%=5;
		}
		
		System.out.println(cnt);
		s.close();
	}
}
