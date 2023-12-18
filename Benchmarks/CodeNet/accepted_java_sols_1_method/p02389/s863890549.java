import java.util.Scanner;
class Main {
	public static void main (String [] args){
		Scanner javain = new Scanner(System.in);
		int a, b;
		a = javain.nextInt();
		b = javain.nextInt();
		System.out.println((a * b) + " " + (a * 2 + b * 2));
		
	}
}