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
		for(int i = 0; i < N; i++) {
			Ws[i] = sc.nextInt();
		}
		
		int S1 = 0;
		int S2 = 0;
		int S1i = 0;
		int S2i = N - 1;
		
		while(S1i <= S2i) {
			if(S1 < S2) {
				S1 += Ws[S1i];
				S1i++;
			} else {
				S2 += Ws[S2i];
				S2i--;
			}
		}
		
		int result;
		if(S1 > S2) {
			result = S1 - S2;
		} else {
			result = S2 - S1;
		}

		System.out.println(result);
	}
	
}
