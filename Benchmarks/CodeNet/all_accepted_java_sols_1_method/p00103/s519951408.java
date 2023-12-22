import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			int point = 0;
			int outCount = 0;
			boolean base[] = new boolean[3];
			while (outCount < 3)
			{
				String event = sc.nextLine();
				
				if (event.equals("HIT"))
				{
					if (base[2])
					{
						point++;
					}
					base[2] = base[1];
					base[1] = base[0];
					base[0] = true;
				}
				else if (event.equals("HOMERUN"))
				{
					for (int j = 0; j < 3; j++)
					{
						if (base[j])
						{
							point++;
							base[j] = false;
						}
					}
					point++;
				}
				else if (event.equals("OUT"))
				{
					outCount++;
				}
			}
			System.out.println(Integer.toString(point));
		}
	}
}