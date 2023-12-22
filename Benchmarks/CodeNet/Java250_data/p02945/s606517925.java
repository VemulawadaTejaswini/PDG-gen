import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int add = a + b;
			int diff = a - b;
			int mult = a * b;
			
			int max = add;
			
			if ( max < diff) {
				max = diff;
			}
			
			if ( max < mult ) {
				max = mult;
			}
			
			System.out.println(max);
			
		}
	}
}
