import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int T = stdIn.nextInt();
		long sum = 0;
		
		int temp = stdIn.nextInt();
		for(int i = 1; i < N; i++) {
			int t = stdIn.nextInt();
			if(t-temp < T) sum += t-temp;
			else sum += T;
			temp = t;
		}
		sum += T;
		
		System.out.println(sum);

	}

}