import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		char[] ch = {'#', '.'};
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0)
			{
				break;
			}
			int pos = 0;
			for(int i = 0; i < H; ++i)
			{
				if(i % 2 == 1)
				{
					pos = 1;
				}
				else
				{
					pos = 0;
				}
				for(int j = 0; j < W; ++j)
				{
					System.out.print(ch[pos]);
					pos = (pos + 1) % 2;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}