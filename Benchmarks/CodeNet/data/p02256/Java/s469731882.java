import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		while (y != 0)
		{
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		System.out.println(x);
		
	}

}
