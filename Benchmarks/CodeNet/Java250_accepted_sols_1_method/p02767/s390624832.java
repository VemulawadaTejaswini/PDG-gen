import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int X[] = new int[N];
		
		int sum = 0;
		for(int x=0; x<N; x++) {
			X[x] = keyboard.nextInt();
			sum += X[x];
		}

		long C = Math.round((double)sum/N);
		int ans = 0;
		for(int c=0; c<N; c++) {
			ans += Math.pow(X[c]-C, 2);
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
