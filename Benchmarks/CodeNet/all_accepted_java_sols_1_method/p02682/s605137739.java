import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong(); //1
		long b = sc.nextLong(); //0
		long c = sc.nextLong(); //-1
		long k = sc.nextLong();
		
		long sum = 0;
		
		long take = Math.min(a, k);
		sum += take;
		k -= take;
		
		if(k > 0)
		{
			k -= b;
		}
		
		if(k > 0)
		{
			sum -= k;
		}
		
		System.out.println(sum);
		
		
	}

}
