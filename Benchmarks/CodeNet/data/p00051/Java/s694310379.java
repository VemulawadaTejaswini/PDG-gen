import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int m=0; m<n; m++)
		{
			String input = scanner.next();					
			int[] num = new int[8];
			
			for(int i=0; i<8; i++)
			{
				num[i] = Integer.parseInt(input.substring(i, i+1));
			}
			
			for(int i=0; i<8; i++)
			{
				for(int j=0; j<8; j++)
				{
					if(num[i] < num[j])
					{
						int buf = num[i];
						num[i] = num[j];
						num[j] = buf;
					}
				}
			}
			
			String min = "";
			String max = "";
			for(int i=0; i<8; i++)
			{
				min += num[i];
				max += num[7-i];
			}
			
			System.out.println(Integer.parseInt(max) - Integer.parseInt(min));
		}
	}
}