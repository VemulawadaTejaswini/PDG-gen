import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int max = ((n-1) * (n-2))/2;
		
		if(k > max)
		{
			System.out.println(-1);
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		int e = n-1 + (max-k);
		sb.append(e + "\n");
		for(int i = 2; i <= n; i++)
		{
			sb.append(1 + " " + i + "\n");
		}
		int xe = max - k;
		int xed = 0;
		
		for(int x = 2; x <= n && xed < xe; x++)
			for(int y = x+1; y <= n && xed < xe; y++)
			{
				sb.append(x + " " + y + "\n");
				xed++;
			}

		System.out.print(sb);
	}

}
