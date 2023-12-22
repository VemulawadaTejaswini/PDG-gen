import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long wa=0;
		long[] bxs=new long[N];
		long tmp1=0;
		long tmp2=0;
		long tmp3=0;
		long tmp4=0;
		for(int i=0; i<N; i++) {
			bxs[i]=sc.nextLong();
		}
		Arrays.sort(bxs);
		if(bxs.length%2==1) {
			long genzai1=bxs[bxs.length/2];
			long genzai2=bxs[bxs.length/2];
			tmp1=0;
			tmp2=0;
			for(int i=0; i<bxs.length/2; i++) {
				tmp1+=Math.abs(genzai1-bxs[N-1-i])+Math.abs(bxs[N-1-i]-bxs[i]);
				tmp2+=Math.abs(genzai2-bxs[i])+Math.abs(bxs[i]-bxs[N-1-i]);
				genzai1=bxs[i];
				genzai2=bxs[N-i-1];
			}
			System.out.println(Math.max(tmp1, tmp2));
		}

		else if(bxs.length%2==0) {
			long genzai1=bxs[bxs.length/2];
			long genzai2=bxs[bxs.length/2];
			tmp1=0;
			tmp2=0;
			for(int i=0; i<bxs.length/2-1; i++) {
				tmp1+=Math.abs(genzai1-bxs[N-1-i])+Math.abs(bxs[N-1-i]-bxs[i]);
				tmp2+=Math.abs(genzai2-bxs[i])+Math.abs(bxs[i]-bxs[N-1-i]);
				genzai1=bxs[i];
				genzai2=bxs[N-i-1];
			}
			tmp1+=Math.abs(genzai1-bxs[N/2-1]);
			tmp2+=Math.abs(genzai2-bxs[N/2-1]);


			long genzai3=bxs[bxs.length/2-1];
			long genzai4=bxs[bxs.length/2-1];
			tmp3=0;
			tmp4=0;
			for(int i=0; i<bxs.length/2-1; i++) {
				tmp3+=Math.abs(genzai3-bxs[N-1-i])+Math.abs(bxs[N-1-i]-bxs[i]);
				tmp4+=Math.abs(genzai4-bxs[i])+Math.abs(bxs[i]-bxs[N-1-i]);
				genzai3=bxs[i];
				genzai4=bxs[N-i-1];
			}
			tmp3+=Math.abs(genzai3-bxs[N/2]);
			tmp4+=Math.abs(genzai4-bxs[N/2]);
			System.out.println(Math.max(Math.max(tmp1, tmp2), Math.max(tmp3, tmp4)));
		}
	}
}