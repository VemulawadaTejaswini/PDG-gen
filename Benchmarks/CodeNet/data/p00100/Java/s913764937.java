import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			
			SalesMan mans[] = new SalesMan[n];
			int last = 0;
			
			for (int i = 0; i < n; i++)
			{
				int id = sc.nextInt();
				EXIST :
				{
					for (int j = 0; j < last; j++)
					{
						if (mans[j].id == id)
						{
							mans[j].value += sc.nextInt() * sc.nextInt();
							break EXIST;
						}
					}
					mans[last] = new SalesMan(id);
					mans[last].value = sc.nextInt() * sc.nextInt();
					last++;
				}
			}
			
			boolean flg = true;
			for (int i = 0; i < last; i++)
			{
				if (mans[i].value >= 1000000)
				{
					System.out.println(Integer.toString(mans[i].id));
					flg = false;
				}
			}
			if (flg)
				System.out.println("NA");
		}
	}
}

class SalesMan
{
	public int id;
	public int value;
	public SalesMan(int num)
	{
		id = num;
	} 
}