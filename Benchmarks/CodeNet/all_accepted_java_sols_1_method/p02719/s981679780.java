import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		if(n % k < k - (n %k))
			k = n % k;
		else 
			k = k - (n %k);
		System.out.println(k);
	}
}