import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		boolean[] has = new boolean[n];
		for(int i = 0; i < k; i++)
		{
			int jn = sc.nextInt();
			for(int j = 0; j < jn; j++)
			{
				int sn = sc.nextInt()-1;
				has[sn] = true;
			}
		}
		
		int c = 0;
		for(int i = 0; i < n; i++)
		{
			if(!has[i])c++;
		}
		System.out.println(c);
	}

}
