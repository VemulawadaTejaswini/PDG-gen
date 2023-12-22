import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long n=s.nextLong();
		long k=s.nextLong();
		
		System.out.println(Math.min(n%k,k-(n%k)));
		
	}
	
}