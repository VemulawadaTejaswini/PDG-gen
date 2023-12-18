import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(), WeightLimit = in.nextInt();

		int vmax = (int) Math.pow(10, 5);
		long wmin[] = new long[vmax + 1];
		Arrays.fill(wmin, 1, vmax + 1, Integer.MAX_VALUE);
		
		for ( int i = 1; i <= num; i++ ) {
			int weight = in.nextInt(), value = in.nextInt();

			for ( int targv = vmax; targv - value >= 0; targv-- ) {
				if ( wmin[targv] > wmin[targv - value] + weight ) {
					wmin[targv] = wmin[targv - value] + weight;
				}
			}
		}
		in.close();

		for ( int v = vmax; 0 <= v; v-- ) {
			if ( wmin[v] <= WeightLimit ) {
				System.out.println(v);
				return;
			}
		}		
	}
}