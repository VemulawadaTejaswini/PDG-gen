import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			double h = sc.nextDouble();
			double a = sc.nextDouble();
			
			System.out.println((int)Math.ceil(h/a));
			
		}
	}
}