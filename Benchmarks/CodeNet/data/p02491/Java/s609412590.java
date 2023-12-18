import java.util.*;

public class Main {
	public static void main(String[] args) {

		long[] ar = new long[2]; 
		long d,r;
		double f;
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0;i < 2;i++){
			ar[i] = sc.nextInt();
		}

		d = ar[0] / ar[1];
		r = ar[0] % ar[1];
		f = (double)ar[0] / (double)ar[1];
				
		System.out.printf("%d %d %.6f \n", d, r, f);
	}
}