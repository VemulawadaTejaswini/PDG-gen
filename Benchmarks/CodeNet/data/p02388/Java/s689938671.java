import java.util.Scanner;

class Cubic{
	public static int cubic(int x){
		return x * x * x;
	}

	public static void main(String[] args){
		int x;

		Scanner stdIn = new Scanner(System.in);

		x = stdIn.nextInt();

		System.out.println(cubic(x));
	}
}