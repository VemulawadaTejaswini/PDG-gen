import java.util.Scanner;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int x = stdin.nextInt();
		System.out.println(Cubic(x));
	}
	
	private static int Cubic(int x)
	{
		return x * x * x;
	}

}