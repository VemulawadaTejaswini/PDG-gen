import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		String totalStr = input.readLine();
		
		int total = Integer.parseInt(totalStr);
		
		String[][] infoStr = new String[total][4]; 
		
		int[][] info = new int[total][4];
		
		for(int number = 0; number < total; number++)
		{
			infoStr[number] = input.readLine().split(" ");
			
			for(int infoNum = 0; infoNum < infoStr[number].length; infoNum++)
			{
				info[number][infoNum] = Integer.parseInt(infoStr[number][infoNum]);
			}
		}
		
		int[][][] officialHouse = {{{0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}},
				{{0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}},
				{{0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}},
				{{0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}}};
		
		for(int infoNum = 0; infoNum <total; infoNum++)
		{
			officialHouse[info[infoNum][0] - 1][info[infoNum][1] - 1][info[infoNum][2] - 1] =
					officialHouse[info[infoNum][0] - 1][info[infoNum][1] - 1][info[infoNum][2] - 1] + info[infoNum][3];
		}
		
		for(int build = 0; build < officialHouse.length; build++)
		{
			for(int floor = 0; floor < officialHouse[build].length; floor++, System.out.println())
				{
					for(int room = 0; room < officialHouse[build][floor].length; room++)
					{
						System.out.print(" " + officialHouse[build][floor][room]);
					}
					
				}
			if(build < officialHouse.length - 1)
			{
				System.out.println("####################");
			}
		}
	}

}

