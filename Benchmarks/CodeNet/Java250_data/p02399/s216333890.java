import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int quo = a / b;
		int rem = a % b;
		double de = 1.0 * a / b;
		String dec = String.format("%.8f", de);
		System.out.println(quo+" "+rem+" "+dec);
	}	
}