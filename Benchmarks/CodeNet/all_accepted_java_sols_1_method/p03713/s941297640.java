import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

/**
 * 		縦に3分割(1<h<w-1)
 *
 *				W
 * 		-----------------------------
 *	H	a	|w -a/2		|
 *			|			|
 *		-----------------------------
 *
 *		縦、横で3分割
 *
 *				W
 * 		-----------------------------
 *		a	|
 *	H		|－－－－－－－－－－－－
 *			|
 *		-----------------------------

 * */

		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		sc.close();

		if (H == 2 && W == 2) {
			System.out.println(1);
			return;
		}

		long S1 = 0;
		long S2 = 0;
		long S3 = 0;

		long ans = Long.MAX_VALUE;

		// 縦3分割
		for(int a=1; a < W-1; a++) {
			long tmpW = (W-a)/2;
			S1 = H * a;
			S2 = H * tmpW;
			S3 = H * (W - a - tmpW);

			long tmpAns = Math.max(S3,Math.max(S1,S2)) -Math.min(S3, Math.min(S1,S2));

			ans = Math.min(tmpAns, ans);
		}

		// 縦横3分割
		for(int a=1; a < W-1; a++) {
			long tmpH = H/2;
			S1 = H * a;
			S2 = (W-a) * tmpH;
			S3 = (W-a) * (H - tmpH);

			long tmpAns = Math.max(S3,Math.max(S1,S2)) -Math.min(S3, Math.min(S1,S2));

			ans = Math.min(tmpAns, ans);
		}

		///WとＨを入れ替える。同じ値なら入れ替え不要
		if(W==H) {
			System.out.println(ans);
			return;
		}


		for(int a=1; a < H-1; a++) {
			long tmpH = (H-a)/2;
			S1 = W * a;
			S2 = W * tmpH;
			S3 = W * (H - a - tmpH);

			long tmpAns = Math.max(S3,Math.max(S1,S2)) -Math.min(S3, Math.min(S1,S2));

			ans = Math.min(tmpAns, ans);
		}

		for(int a=1; a < H-1; a++) {
			long tmpW = W/2;
			S1 = W * a;
			S2 = (H-a) * tmpW;
			S3 = (H-a) * (W - tmpW);

			long tmpAns = Math.max(S3,Math.max(S1,S2)) -Math.min(S3, Math.min(S1,S2));

			ans = Math.min(tmpAns, ans);
		}

		System.out.println(ans);
	}
}
