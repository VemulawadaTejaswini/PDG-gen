import java.util.Arrays;
import java.util.Scanner;

public class Main{ //ABC128B
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int[] W = new int[N];

		for(int i=0;i<N;i++) {
			W[i] = Integer.parseInt(sc.next());
		}

		int[] min = new int[N-1];

		for(int i=0;i<N-1;i++) {

			int l = 0;
			int r = 0;
			for(int j=0;j<N;j++){
				if(j<=i){
					l += W[j];
				}else {
					r += W[j];
				}
			}
			min[i] = Math.abs(l-r);
		}//Math.abs();

		Arrays.sort(min);
		System.out.println(min[0]);
	}
}