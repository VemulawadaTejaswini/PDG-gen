import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Long[] h = new Long[n];
		for(int i=0;i<n;i++){
			h[i] = sc.nextLong();
		}
		sc.close();

		Arrays.sort(h, Collections.reverseOrder());
		long r = 0L;
		for(int i=k;i<n;i++){
			r+=h[i];
		}
		System.out.println(r);
	}
}