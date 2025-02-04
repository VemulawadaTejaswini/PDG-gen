import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		long sum = 0;
		long res = 0;
		int N = cin.nextInt();
		int dummyN = N;
		while (dummyN-->0) {
			int num = cin.nextInt();
			res += num * num;
			sum += num;
		}
		long bestX1 = (long)Math.ceil((double)(sum) / N);
		long bestX2 = (long)Math.floor((double)(sum) / N);
		System.out.println(Math.min(res, Math.min((N * bestX1 - 2 * sum) * bestX1, (N * bestX2 - 2 * sum) * bestX2) + res));
	} 
}
