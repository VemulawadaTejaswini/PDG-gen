import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int max = 10000000;
	static boolean[] isPrime = new boolean[max];
	public static void main(String[] args) {
		aryPrime();
		int[] cnt = new int[max];
		int k = 0;
		for(int i = 0; i < max; i++) {
			if(isPrime[i]) {
				k++;
			}
			cnt[i] = k;
		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(cnt[n]);
		}
		sc.close();
	}
	static void aryPrime(){
        int l = isPrime.length;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= (int)Math.sqrt(l); i++) {
            if(isPrime[i]) {
                for(int j = i * 2; j < l; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
