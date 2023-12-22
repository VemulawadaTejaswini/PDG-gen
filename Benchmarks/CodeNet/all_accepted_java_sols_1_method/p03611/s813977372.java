import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextInt();
		}

		Arrays.sort(A);
		int ans = 0;
		int count_a = 0,count_b = 0,count = 0;
		int buf = -1;
		for(int i = 0;i < N;i++) {
			if(buf == A[i]) {
				count++;
			}else if(buf == A[i]-1){
				count_a = count_b;
				count_b = count;
				count = 1;
			}else if(buf == A[i] - 2) {
				count_a = count;
				count_b = 0;
				count = 1;
			}else {
				count_a = 0;
				count_b = 0;
				count = 1;
			}
			buf = A[i];
			ans = Math.max(ans, count_a + count_b + count);
		}
		System.out.println(ans);

	}

}
