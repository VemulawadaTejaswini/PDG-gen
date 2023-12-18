import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int r = a % b;
		double f = (double)a / (double)b;
		
		
		System.out.printf("%d %d %f\n", (int)f, r, f);
	}
}