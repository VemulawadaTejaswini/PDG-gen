import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long []arr = {a,b,c,d};
		long total = 0;
		long max = Long.MIN_VALUE;
		for(int i = 0 ; i < 2; i++)
		{
			for(int j = 2; j<4; j++)
			{
					total = arr[i] * arr[j];
				
				if(total > max)
				{
					max = total;
					
				}
				
			}
		}
		System.out.println(max);
	}

}