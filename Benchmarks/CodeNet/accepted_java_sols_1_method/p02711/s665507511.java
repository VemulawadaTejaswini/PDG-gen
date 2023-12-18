import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int right = num % 10;
		int mid = (num / 10) % 10;
		int left = (num / 10) / 10;
		
		if (right == 7 || mid == 7 || left == 7)
			System.out.println("Yes");
		else 
			System.out.println("No");
		
		

	}
}
