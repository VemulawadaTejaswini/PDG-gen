import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			double r = sc.nextDouble();
			
			System.out.println(Math.PI * 2f * r);
		}
	}

}