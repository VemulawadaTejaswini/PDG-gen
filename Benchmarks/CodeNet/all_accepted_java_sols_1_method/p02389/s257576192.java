import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int l = sc.nextInt();
		int product = w * l;
		int around = 2 * (w + l);
		System.out.println(product + " " + around);
		
	}
}