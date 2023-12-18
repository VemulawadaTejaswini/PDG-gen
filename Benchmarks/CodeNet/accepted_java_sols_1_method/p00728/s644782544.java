import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int n, s, min, max, ave;

			while(true)
			{
				min = 0;
				max = 0;
				ave = 0;

				n = sc.nextInt();
				if(n == 0)
				{
					break;
				}

				for(int i = 0; i < n; i++)
				{
					s = sc.nextInt();
					ave += s;

					if(i == 0)
					{
						min = s;
						max = s;
					}
					else if(i == 1)
					{
						if(s <= min)
						{
							min = s;
						}
						else
						{
							max = s;
						}
					}

					if(s <= min)
					{
						min = s;
					}
					if(s >= max)
					{
						max = s;
					}
				}
				ave -= min;
				ave -= max;
				ave /= (n - 2);

				System.out.println(ave);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}