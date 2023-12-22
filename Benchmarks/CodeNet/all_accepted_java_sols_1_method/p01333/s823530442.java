
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int A=sc.nextInt(),B=sc.nextInt();
			if ((A|B)==0)break;
			
			int n100=0,n500=0,n1000=0;
			
			int ret = B - A;
			
			while (ret - 1000 >= 0)
			{
				ret -= 1000;
				n1000++;
			}
			while (ret - 500 >= 0)
			{
				ret -= 500;
				n500++;
			}
			while (ret - 100 >= 0)
			{
				ret -= 100;
				n100++;
			}
			System.out.println(n100 + " " + n500 + " " + n1000);
		}
	}
}