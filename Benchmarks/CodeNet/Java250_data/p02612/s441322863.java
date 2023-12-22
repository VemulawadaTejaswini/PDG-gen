import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int change;
		if (n % 1000 == 0) change = 0;
		else change = 1000 - (n % 1000);
		
		System.out.println(change);
		
		sc.close();
	}
	
}

