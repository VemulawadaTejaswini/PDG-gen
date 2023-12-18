import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a = n % 1000;
		
		if(a==0) {
			System.out.println(0);
			
		}
		
		else {
			System.out.println(1000-a);
		}
	}

	
}
