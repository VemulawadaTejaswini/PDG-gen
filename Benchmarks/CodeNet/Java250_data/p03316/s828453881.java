import java.util.*;

public class Main
{ 
	static String isDivisible(long n) 
	{ 
		long temp = n; 
		int sum = 0; 
		while (n != 0) 
		{ 
			int k = (int) n % 10; 
			sum += k; 
			n /= 10; 
		} 
		if (temp % sum == 0) 
			return "Yes"; 
	
		return "No"; 
	} 
	public static void main(String []args) 
	{ 
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong(); 
		System.out.println(isDivisible(n)); 
	} 
} 
