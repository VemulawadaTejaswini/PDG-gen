import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int a = 0;
		
		do {
			a++;
			n--;
			
		} while (a * 2 * d < n);
		
		System.out.println(a);
		
		sc.close();
		
	}

}