import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] joshi = new int[N-1];
		int[] buka_cnt = new int[N] ;
		for(int i = 0;i<N-1;i++) {
			joshi[i] = sc.nextInt();
		}
		for(int i = N-2;i>=0;i--) {
			buka_cnt[joshi[i]-1]++;
		}
		for(int j :buka_cnt) {
			System.out.println(j);
		}
	}

}