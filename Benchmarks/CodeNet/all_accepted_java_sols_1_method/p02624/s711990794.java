import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() ;
//		long ts = System.currentTimeMillis();
		long f[] = new long[N + 1];
		Arrays.fill(f, 1);
		for(int i = 2 ; i <= N ; ++i){
			for(int j = i ; j <= N ; j += i){
				f[j]++;
			}
		}
		long ret = 0;
		for(int i = 1 ; i <= N ; ++i){
			ret += i * f[i];
		}
		System.out.println(ret);
//		long te = System.currentTimeMillis();
//		System.out.println(te - ts);
	}
}
