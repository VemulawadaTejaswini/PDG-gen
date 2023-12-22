import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int ax = a, bx = b;
		for(int i = 1; i < b; i++){
			ax *= 10;
			ax += a;
		}

		for(int i = 1; i < a; i++){
			bx *= 10;
			bx += b;
		}
		
		System.out.println(ax >= bx ? ax : bx);
		
	}
}
