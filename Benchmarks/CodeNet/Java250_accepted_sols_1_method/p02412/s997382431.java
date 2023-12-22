import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		for(;;)
		{
			String[] numberStr = input.readLine().split(" ");
			
			int max = Integer.parseInt(numberStr[0]);
			
			int sum = Integer.parseInt(numberStr[1]);
			
			if((max == 0)&&(sum == 0))
			{
				break;
			}
			
			int set = 0;
			
			for(int oneNum = 1; oneNum <= max - 2; oneNum++)
			{
				for(int twoNum = oneNum + 1; twoNum <= max + 1; twoNum++)
				{
					for(int threeNum = twoNum + 1; threeNum <= max; threeNum++)
					{
						if(oneNum + twoNum + threeNum == sum)
						{
							set++;
						}
					}
				}
			}
			
			System.out.println(set);
		}
	}
}

