import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int k=s.nextInt();
		
		int l=s.nextInt();
		int r=s.nextInt();
		
		int p=0;
		
		for(int i=k;i<=r;i=i+k)
		{
			if(i>=l&&i<=r)
			{
				p=1;
				break;
			}
		}
		
		if(p==1)
		{
			System.out.println("OK");
		}
		else
		{
			System.out.println("NG");
		}
		
	}
	
}