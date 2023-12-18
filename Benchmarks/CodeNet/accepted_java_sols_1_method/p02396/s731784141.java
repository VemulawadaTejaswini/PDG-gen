import java.util.Scanner;

public class Main {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i = 1;
		int x;
		while((x =sc.nextInt() )!= 0) {
			
				System.out.println("Case" + " " + i + ": " + x);
				i++;
		}
	}
}

