import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		long ans=n+(n*n)+(n*n*n);
		
		System.out.println(ans);
		
	}
	
}