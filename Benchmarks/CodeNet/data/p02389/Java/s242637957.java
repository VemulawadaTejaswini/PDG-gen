import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a*b+" "+(2*a+2*b));
	}
}