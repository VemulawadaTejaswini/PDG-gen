import java.util.Scanner;

class Main{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);

		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		
		System.out.println(Math.abs(x1-x2));

	}
}
