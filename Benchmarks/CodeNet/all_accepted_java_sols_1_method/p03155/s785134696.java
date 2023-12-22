import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			System.out.println((n-h+1)*(n-w+1));

		}
	}
}