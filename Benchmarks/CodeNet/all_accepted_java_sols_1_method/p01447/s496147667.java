import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int i=1;
			for(;;)
			{
				if(n<=Math.pow(3, i))
					break;
				i++;
			}
			System.out.println(i);
		}
	}
}