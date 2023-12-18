import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		
		System.out.println((r * r * 3.1415926535) + " " + (r * 2 * 3.1415926535));
	}
}