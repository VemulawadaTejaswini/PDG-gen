

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String[] s = new String[2];
		
		while(true)
		{
			s[0] = scan.next();
			if(s[0].equals(".")) {break;}
			s[1] = scan.next();
			List<String> ss1 = new ArrayList<String>();
			
			List<Integer> location = new ArrayList<Integer>();
			
			int miniCounter = -1;
			
			int stringDifferences = 0;
			int numOfSs2 = 0;
			boolean done = false;
			

			if(!done)
			{
				if(numOfSs2 == ss1.size())
				{
					if(stringDifferences == 1)
					{
						System.out.println("CLOSE");
					}
					else if(stringDifferences == 0)
					{
						System.out.println("IDENTICAL");
					}
				}
				else
				{
//					System.out.println(ss1.size() + " vs " + numOfSs2);
					System.out.println("DIFFERENT");
				}
			}
		}
	}

}

