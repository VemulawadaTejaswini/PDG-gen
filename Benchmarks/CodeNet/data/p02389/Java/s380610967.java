import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int h = sc.nextInt();
		int w = sc.nextInt();

		int sqare = h * w;
		int round = 2 *(h + w);
		
		System.out.print(sqare + " " + round);

	}

}