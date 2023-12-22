import java.util.ArrayList;
import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		ArrayList<Integer> h=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			int buf=sc.nextInt();
			if(i==0){h.add(0,buf);};
			for(int j=i-1;j>=0;j--)
			{
				if(buf<=h.get(j))
				{
					h.add(j+1,buf);
					break;
				}
				else if(j==0)
				{
					h.add(0,buf);
				}

			}

		}
		for(int i=0;i<3;i++)
		{
			System.out.println(h.get(i));
		}

	}

}