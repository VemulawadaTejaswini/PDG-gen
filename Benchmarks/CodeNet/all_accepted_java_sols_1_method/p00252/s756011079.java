import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String s=in.nextLine();
			boolean judge=false;
			if(s.equals("1 1 0")||s.equals("0 0 1"))
				judge=true;
			
			System.out.println(judge ? "Open" : "Close");
		}
	}
}