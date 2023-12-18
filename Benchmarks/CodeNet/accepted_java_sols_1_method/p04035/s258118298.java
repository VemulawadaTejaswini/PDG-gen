import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long l = sc.nextInt();
		
		long[] a = new long[n];
		long prev = 0;
		
		for(int i = 0; i < n; i++)
		{
			long cur = sc.nextLong();
			
			if(i>0 && prev+cur >= l)
			{ //end here
				System.out.println("Possible");
				StringBuilder sb = new StringBuilder();
				for(int k = 1; k < i; k++)
					sb.append(k + "\n");
				for(int k = n-1; k >= i+1; k--)
					sb.append(k + "\n");
				sb.append(i + "\n");
				System.out.println(sb);
				return;
			}
			
			prev = cur;
		}
		
		System.out.println("Impossible");

	}

}
