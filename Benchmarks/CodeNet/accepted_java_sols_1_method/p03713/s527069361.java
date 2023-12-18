



import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long H=sc.nextLong();
		long W=sc.nextLong();
		long diff=1000000007;

		long ni_kiriwake=0;

		long tmp1=0,tmp2=0,tmp3=0,tmp4=0;
		if(H%3==0 || W%3==0) {		//どちらかの辺が３の倍数ならば無条件でみんな同じ面積に切り分けることができる
			System.out.println(0);
		}

		else if(H==W) {		//正方形の時
			ni_kiriwake=(H+1)/2;

			for(int i=1; i<W; i++) {
				tmp1=(H-ni_kiriwake)*(W-i);
				tmp2=ni_kiriwake*(W-i);
				tmp3=H*i;
				tmp4=Math.max(tmp1, Math.max(tmp2, tmp3))-Math.min(tmp1, Math.min(tmp2, tmp3));
				diff=Math.min(diff, tmp4);
			}

			if(H>3) {
				diff=Math.min(diff, H);		// 320x320 なら 107　107　106*320　みたいに
			}
			System.out.println(diff);
		}

		else if(H!=W) {
			ni_kiriwake=(H+1)/2;

			for(int i=1; i<W; i++) {
				tmp1=ni_kiriwake*i;
				tmp2=(H-ni_kiriwake)*i;
				tmp3=H*(W-i);
				tmp4=Math.max(tmp1, Math.max(tmp2, tmp3))-Math.min(tmp1, Math.min(tmp2, tmp3));
				diff=Math.min(diff, tmp4);
			}

			if(H>3) {
				diff=Math.min(diff,W);		// 320x320 なら 107　107　106*320　みたいに
			}

			ni_kiriwake=(W+1)/2;

			for(int i=1; i<H; i++) {
				tmp1=ni_kiriwake*i;
				tmp2=(W-ni_kiriwake)*i;
				tmp3=W*(H-i);
				tmp4=Math.max(tmp1, Math.max(tmp2, tmp3))-Math.min(tmp1, Math.min(tmp2, tmp3));
				diff=Math.min(diff, tmp4);
			}

			if(W>3) {
				diff=Math.min(diff,H);		// 320x320 なら 107　107　106*320　みたいに
			}

			System.out.println(diff);
		}
	}
}