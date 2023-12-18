import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); in.nextLine();
		int[] ary = new int[N];
		
		for ( int i = 0; i < N; i++ ) {
			ary[i] = in.nextInt(); in.nextLine();
		}
		
		Arrays.sort(ary);
		
		int maxMochi = 101;
		int layers = 0;
		for ( int i = N-1; i >= 0; i-- ) {
			if ( ary[i] < maxMochi ) {
				layers++;
				maxMochi = ary[i];
			}
		}
		
		System.out.println(layers);
		
	}
}