import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		
		System.out.println((r * r * 3.141592653589793) + " " + (r * 2 * 3.141592653589793));
	}
}