import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n,m,sum_01,sum_02;
		int[] ar;

		while (true){
			
			if( (n = sc.nextInt()) == 0 ) {
				break;
			}
			sum_01 = 0;
			sum_02 = 0;
			ar = new int[n];

			for(int i = 0;i < n;i++){
				sum_01 += ar[i] = sc.nextInt();
			}
				m = sum_01 / n;
			
			for(int i = 0;i < n;i++){
				sum_02 += Math.pow((ar[i] - m),2);
			}
			
			System.out.printf("%.6f\n",Math.sqrt(sum_02 / n));
			
		}
	}
}