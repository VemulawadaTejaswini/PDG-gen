import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int N = sc.nextInt();
		
		// map[N]: the table of the sides of polygon 
		int map[] = new int[N];

		int Max = 0;
		int sumOfSideLength = 0;

		for (int i=0; i<N; i++)
		{

			map[i] = sc.nextInt	();
			sumOfSideLength = sumOfSideLength + map[i];
			
			if (map[i]> Max)
			{
				Max = map[i];
			}
		}

		sumOfSideLength = sumOfSideLength - Max*2;
		
		if (sumOfSideLength > 0)
		{
			System.out.println("Yes");
		}	
		
		else
		{
			System.out.println("No");
		}	
	}
}