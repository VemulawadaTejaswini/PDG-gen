import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			double l = sc.nextDouble();
			
			double edge = l/3;
			
			System.out.println(String.format("%f", Math.pow(edge, 3)));
		}
	}

}