import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
	
		int b = sc.nextInt();
		if(a<=0&&0<=b) {
			System.out.println("Zero");
			System.exit(0);
		}else if(0<=a) {
			System.out.println("Positive");
			
		}else if((b-a)%2==0) {
			System.out.println("Negative");

		}else {
			System.out.println("Positive");
		}
		
		sc.close();
		
	}
}
