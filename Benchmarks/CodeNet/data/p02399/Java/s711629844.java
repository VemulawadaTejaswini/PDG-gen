import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		float a = scan.nextInt();
		float b = scan.nextInt();

		scan.close();

		System.out.printf("%d %d %f", a/b, a%b, a/b);
	}

}