import java.util.*;
public class Main{
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			int h,a,c=0;
			h=sc.nextInt();
			a=sc.nextInt();
			if((h<=0 || h>=10001) || (a<=0 || a>=10001))
			{
			 	System.out.println("EXit.....");
			}
			else
			{
				for(;;)
				{
					if(h<=0)
					{
						System.out.println(c);
						break;
					}
					else{
						h=h-a;
						c++;
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}