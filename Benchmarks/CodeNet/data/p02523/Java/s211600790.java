import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		double x2 = input.nextInt();
		double y2 = input.nextInt();
		
		double len = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println(len);
	}
}