import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int c = 0;
		for(int i = 1; i <= n; i++)
		{
			for(int j = i+1; j <= n; j++)
			{
				if(n%2==0)
				{
					if(i+j==n+1)continue;
				}
				else
				{
					if(i+j==n)continue;
				}
				c++;
				sb.append(i + " " + j + "\n");
//				System.out.println(i + " " + j);
			}
		}
		System.out.println(c);
		System.out.print(sb);


	}

}
