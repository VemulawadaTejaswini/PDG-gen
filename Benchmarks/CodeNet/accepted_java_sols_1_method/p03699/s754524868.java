



import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int ki=0;
		int gu=0;
		int sum=0;
		int[] ten=new int[N];
		for(int i=0; i<N; i++) {
			ten[i]=sc.nextInt();
			sum+=ten[i];
			if(ten[i]%2==1) {
				ki++;
			}
			else {
				gu++;
			}
		}
		if(ki>0 && gu>0) {
			int[] Kiten=new int[ki];
			int[] Guten=new int[gu];

			ki=0; gu=0;

			for(int i=0; i<N; i++) {
				if(ten[i]%2==0) {
					Guten[gu]=ten[i];
					gu++;
				}
				else if(ten[i]%2==1) {
					Kiten[ki]=ten[i];
					ki++;
				}
			}

			Arrays.sort(Kiten);
			Arrays.sort(Guten);
			if(ki%2==0) {
				System.out.println(sum-Kiten[0]);
			}
			else if(ki%2==1) {
				System.out.println(sum);
			}
		}
		else if(ki==0) {
			System.out.println(0);
		}
		else if(gu==0) {
			Arrays.sort(ten);

			int wa=0;
			for(int i=0; i<N; i++) {
				wa+=ten[i];
			}
			if(N%2==1) {
				System.out.println(wa);
			}
			else {
				System.out.println(wa-ten[0]);
			}
		}
	}
}