import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int X = stdIn.nextInt();
		int Y = stdIn.nextInt();
		int AB = 2*C;
		
		int sum = 0;
		sum += Math.min(A+B, AB)*Math.min(X, Y);
		if(X >= Y) {
			sum += Math.min(A, AB)*(X-Y);
		}
		else {
			sum += Math.min(B, AB)*(Y-X);
		}
		
		System.out.println(sum);

	}

}