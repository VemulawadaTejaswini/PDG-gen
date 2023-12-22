import java.util.Scanner;

/**
 * 2019/06/09
 * AtCoder Beginner Contest 129
 * 
 * B - Balance
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] Ws = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			Ws[i] = sc.nextInt();
			sum += Ws[i];
		}

		int min = Integer.MAX_VALUE;
		int S1 = 0;
		int S2 = 0;
		for(int i = 0; i < N; i++) {
			S1 += Ws[i];
			S2 = sum - S1;
			int sa = S2 - S1;
			if(sa < 0) {
				sa = sa * -1;
				i = N;
			}
			if(sa < min) {
				min = sa;
			} 
		}

		System.out.println(min);
	}
	
}