import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int na[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			na[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		if (na[4] - na[0] > k)
		{
			System.out.println(":(");
		}
		else
		{
			System.out.println("Yay!");
		}
	}
}