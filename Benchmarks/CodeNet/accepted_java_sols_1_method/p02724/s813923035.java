import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Happy = X/500;
		int happy = (X%500)/5;
		System.out.println(1000 * Happy + 5 * happy);
	}
}