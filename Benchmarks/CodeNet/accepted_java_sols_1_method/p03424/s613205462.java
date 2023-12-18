import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			if (sc.next().charAt(0) == 'Y') {
				System.out.println("Four");
				return;
			}
			
		}
		
		System.out.println("Three");
		
	}

}