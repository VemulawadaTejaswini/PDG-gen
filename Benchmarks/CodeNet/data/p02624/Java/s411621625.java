import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() ;
		long fillArray[] = new long[N + 1];
		Arrays.fill(fillArray, 1);
		for(int i = 2 ; i <= N/2 ; ++i){
			for(int j = i ; j <= N ; j += i){
				fillArray[j]++;
			}
		}
		long ans = 0;
		for(int i = 1 ; i <= N ; ++i){
			ans += i * fillArray[i];
		}
		System.out.println(ans);
//		long te = System.currentTimeMillis();
//		System.out.println(te - ts);
	}
}
