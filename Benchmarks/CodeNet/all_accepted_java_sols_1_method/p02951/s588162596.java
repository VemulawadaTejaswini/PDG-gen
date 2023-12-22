import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ( a-b > c ) {
			System.out.println(0);
		}else {
			System.out.println(c+b-a);			
		}
		
		sc.close();
	}

}