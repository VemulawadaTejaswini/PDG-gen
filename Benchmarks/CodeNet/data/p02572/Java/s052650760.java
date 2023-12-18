import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<Integer>();
		double sum = 0;
		int N = stdIn.nextInt();
		for(int i = 0; i < N; i ++) {
			A.add(stdIn.nextInt());
			sum += A.get(i);
		}
		
		double ans = 0;
		
		for(int i = 0; i < A.size() - 1; i ++) {
			sum -= A.get(i);
			ans += A.get(i) * sum;
		}
		
		System.out.println((int)(ans % (Math.pow(10, 9) + 7)));
		
	}
}