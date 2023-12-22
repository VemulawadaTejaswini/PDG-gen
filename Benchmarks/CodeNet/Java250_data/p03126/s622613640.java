import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),ans=0;
		int[] counter = new int[M+1];
		for(int i=0; i<N;i++) {
			int num = sc.nextInt();
			for(int j=0 ;j<num; j++) {
				counter[sc.nextInt()]++;
			}
		}
		for (int i : counter) {
			if(i == N) ans++;
		}
		System.out.println(ans);
	}
}
