import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		String sign;
		if(a < b && b< c)
			sign = "Yes";
		else 
			sign = "No";
		
		System.out.println(sign);
	}
}