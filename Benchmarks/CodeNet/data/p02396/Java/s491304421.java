import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x != 0){
			System.out.println("Case i: " + x);
			x = scan.nextInt();
		}
	}
}