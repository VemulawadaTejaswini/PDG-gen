import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int dataSize = Integer.parseInt(sc.nextLine());
		int[][] data = new int[dataSize][3];
	
		for(int i = 0; i < dataSize; ++i)
		{
			String[] splitted = sc.nextLine().split("\\s+");
			data[i][0] = Integer.parseInt(splitted[0]);
			data[i][1] = Integer.parseInt(splitted[1]);
			data[i][2] = Integer.parseInt(splitted[2]);
		}
		
		for(int i = 0; i < dataSize; ++i)
		{
			if(IsRight(data[i][0],data[i][1],data[i][2]))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}
	
	public static boolean IsRight(int a, int b, int c)
	{
		if((a*a == b*b + c*c) || (b*b == a*a + c*c ) || (c*c == a*a + b*b))
			return true;
		else 
			return false;	
	}
	
	
	
	

	
} 