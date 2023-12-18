import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		
		int buy = X-A;
		int count = buy/B;
		int V = B*count;
		int Y = buy-V;
		
		System.out.println(Y);
	}

}
