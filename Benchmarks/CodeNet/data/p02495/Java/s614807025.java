import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine())
		{
			String[] str = sc.nextLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			
			if (H == 0 && W == 0)
			{
				break;
			}
			
			for (int i = 0; i < H; i++)
			{
				for (int j = 0; j < W - 1; j++)
				{
					//iが奇数か、jが奇数か
					String s1 = i % 2 != 0 ? j % 2 != 0 ? "#" : "." : j % 2 != 2 ? "." : "#";
					System.out.print(s1);
				}
				
				//iが奇数か
				String s2 = i % 2 != 0 ? "." : "#";
				System.out.println(s2);
			}
			
			System.out.println("");
		}
	}
}