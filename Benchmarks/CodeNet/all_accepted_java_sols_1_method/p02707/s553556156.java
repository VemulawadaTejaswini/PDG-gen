import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] count = new int[n];
		
		for(int i = 0; i < n-1; i++)
		{
			int cur = sc.nextInt()-1;
			count[cur]++;
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(count[i]);
		}
	}

}
