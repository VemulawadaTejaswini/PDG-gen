
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] numbers = new long[N];
		long[] cnts = new long[N];
		for (int i=0;i<N;i++) {
			long n = sc.nextLong();
			numbers[i] = n;
			cnts[(int) (n-1)]++;
		}
//		System.out.println(Arrays.toString(cnts));
		long[][] kumis = new long[2][N];
		int i = 0;
		for(long c:cnts) {
			if (c!=0) {
				kumis[0][i]= c*(c-1)/2;
				if(c!=1) {
					kumis[1][i]= (c-2)*(c-1)/2;
				}
			}
			i++;
			
		}
//		System.out.println(Arrays.toString(kumis[0]));
		long total = Arrays.stream(kumis[0]).sum();
		for(long n :numbers) {
			long ans = total-kumis[0][(int) (n-1)]+kumis[1][(int) (n-1)];
			System.out.println(ans);
		}
	}

}