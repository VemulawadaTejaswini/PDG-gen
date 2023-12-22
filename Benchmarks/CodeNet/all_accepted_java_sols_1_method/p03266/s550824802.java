import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] tori=new long[K];
		long tmp1=0,tmp2=0;
		for(int i=1; i<=K; i++) {
			tmp1=(N+(i%K))/K;
			if(i%K==0) {
				tmp2=(N-(i%K))/K;
			}
			else {
				tmp2=(N-(i%K))/K+1;
			}

			if(2*i%K==0) {
				tori[i%K]=tmp1*tmp2;
			}
			else {
				tori[i%K]=0;
			}
			//System.out.println(tori[i%K]);
		}
		long sousuu=0;

		for(int i=1; i<=N; i++) {
			sousuu+=tori[i%K];
		}
		System.out.println(sousuu);
	}
}