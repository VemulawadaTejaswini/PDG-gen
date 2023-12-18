import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==-1)
				return;
			System.out.println(Integer.toString(n, 4));
		}
	}
}