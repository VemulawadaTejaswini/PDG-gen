import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println(gcd(x, y));
		
	}
	
	public static int gcd(int x, int y) {
		
		while(x!=0 && y!=0) {
			
			int z = y;
			y = x%y;
			x = z;
			
		}
		
		return x+y;
		
	}

}

