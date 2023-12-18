import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			int t = sc.nextInt();
			
			System.out.println(t / a * b);
		}

	}
}
