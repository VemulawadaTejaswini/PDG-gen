


import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		int[] aa=new int[100001];
		long[] souwa=new long[100001];
		long[] kousu=new long[100001];

		for(int i=0; i<100001; i++) {
			aa[i]=i;
			souwa[i]=0;
			kousu[i]=0;
		}

		int N=sc.nextInt();
		long K=sc.nextLong();
		long tmp1=0,tmp2=0;
		for(int i=0; i<N; i++) {
			tmp1=sc.nextLong();
			tmp2=sc.nextLong();
			kousu[(int) tmp1]+=tmp2;
		}
		souwa[0]=0;
		for(int i=1; i<=100000; i++) {
			souwa[i]=souwa[i-1]+kousu[i];
		}
		long kagen=0;
		long jyoge=0;

		for(int i=1; i<=100000; i++) {
			kagen=souwa[i-1]+1;
			jyoge=souwa[i];
			if(jyoge==0) {
				kagen=0;
			}
			else if(kagen==1) {
				kagen=0;
			}

			if(kagen<=K && K<=jyoge) {
				System.out.println(i);
				System.exit(0);
			}
		}
	}
}