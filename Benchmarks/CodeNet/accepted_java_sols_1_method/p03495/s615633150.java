
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();

		int syurui=0;

		int[] balls=new int[200001];
		for(int i=0; i<=200000; i++) {
			balls[i]=0;
		}
		int tmp=0;
		for(int i=0; i<N; i++) {
			tmp=sc.nextInt();
			if(balls[tmp]==0) {
				syurui++;
			}
			balls[tmp]++;
		}
		Arrays.sort(balls);
		int tmp1=200000-syurui;
		int kei=0;
		for(int i=tmp1; i<=200000-K; i++) {
			kei+=balls[i];
		}
		System.out.println(kei);
	}
}