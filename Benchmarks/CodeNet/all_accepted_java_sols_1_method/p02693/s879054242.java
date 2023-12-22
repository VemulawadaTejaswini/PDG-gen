import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		for(int i = l; i <= r; i++)
		{
			if(i%n == 0)
			{
				System.out.println("OK");
				return;
			}
		}
		System.out.println("NG");
	}

}
