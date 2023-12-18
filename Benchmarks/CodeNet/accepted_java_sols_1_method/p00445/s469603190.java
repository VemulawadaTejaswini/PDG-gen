import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str = sc.next();
			int jo=0;
			int io=0;
			for(int i=0; i<str.length()-2; i++)
			{
				if(str.charAt(i)=='J')
					if(str.charAt(i+1)=='O')
						if(str.charAt(i+2)=='I')
							jo++;	
				if(str.charAt(i)=='I')
					if(str.charAt(i+1)=='O')
						if(str.charAt(i+2)=='I')
							io++;	
			}
			System.out.println(jo);
			System.out.println(io);
		}
	}

}