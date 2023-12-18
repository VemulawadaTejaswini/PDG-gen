import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next() );
		int b = Integer.parseInt(in.next() );

		System.out.println(a*b + " " + (a+b) * 2);

	}

}