import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] d = new int[N];
		
		for(int i = 0; i < N; i++) {
			d[i] = stdIn.nextInt();
		}
		Arrays.sort(d);
		
		System.out.println(d[N/2]-d[N/2-1]);

	}

}