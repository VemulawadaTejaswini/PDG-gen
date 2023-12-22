import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int capacity = a - b;
			
			if ( c > capacity ) {
				System.out.println(c - capacity);
			}
			else {
				System.out.println(0);
			}
			
		}
	}
}
