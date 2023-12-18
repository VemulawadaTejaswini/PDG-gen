import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0)
			{
				break;
			}
			String s1 = "";
			String s2 = "";
			boolean flag = true;
			for(int i = 0; i < W; ++i)
			{
				if(flag)
				{
					s1 += "#";
					s2 += ".";
				}
				else
				{
					s1 += ".";
					s2 += "#";
				}
				flag = !flag;
			}
			flag = true;
			for(int i = 0; i < H; ++i)
			{
				if(flag)
				{
					System.out.println(s1);
				}
				else
				{
					System.out.println(s2);
				}
				flag = !flag;
			}
			System.out.println("");
		}
	}
}