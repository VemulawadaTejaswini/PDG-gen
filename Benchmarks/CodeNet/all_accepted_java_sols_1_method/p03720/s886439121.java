import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] city = new int[N];
		Arrays.fill(city, 0);
		
		for(int i = 0; i < M; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			city[a-1]++;
			city[b-1]++;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(city[i]);
		}

	}

}