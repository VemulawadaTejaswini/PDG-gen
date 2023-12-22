import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if (x < 5) {
			System.out.println(0);
			return;
		}
		
		int happy = (x / 500) * 1000;
		happy += ((x % 500) / 5) * 5;
		System.out.println(happy);
	}

}
