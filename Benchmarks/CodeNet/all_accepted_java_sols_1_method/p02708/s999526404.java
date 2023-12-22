import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long mod = (long) (Math.pow(10, 9)+7);
		int N = sc.nextInt(), K = sc.nextInt();
		int[] NList = new int[N+1];
		for(int i=0;i<N+1;i++) {
			NList[i]=i;
		}
		long[] ruisekiwa = new long[N+1];
		for(int i = 1;i<N+1;i++) {
			ruisekiwa[i]= ruisekiwa[i-1]+NList[i];
		}
		long wa = ruisekiwa[N];
		long ans = 0;
		for(int i= K;i<N+1;i++) {
//			System.out.println(i);
			long min = ruisekiwa[i-1];
			long max = wa-ruisekiwa[N-i];
//			System.out.println(max);
//			System.out.println(min);
			ans += max-min+1;
			ans %= mod;
		}
		System.out.println(ans+1);
	}

}