import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int h = n/3600;
		int m = (n%3600)/60;
		int s = (n%3600)%60;
		
		System.out.println(h+":"+m+":"+s);
	}
}