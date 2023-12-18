import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)	
		{
			int r=in.nextInt(),c=in.nextInt();
			if((r|c)==0)
				return;
			System.out.println( r*c%2==0 ? "Yes":"No");
		}
	}
}