import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int val2 = val;
		val = scan.nextInt();
		
		System.out.print(val * val2 + " ");
		System.out.println(val + val + val2 + val2);	
	}
}