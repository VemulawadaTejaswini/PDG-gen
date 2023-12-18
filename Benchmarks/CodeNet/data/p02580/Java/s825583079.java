import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_E
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();

		int F[][] = new int[H+1][W+1];
		for(int i=0; i<H+1; i++) {
			Arrays.fill(F[i], 0);
		}

		int zaH[] = new int[M];
		int zaW[] = new int[M];

		for(int i=0; i< M; i++) {
			zaH[i] = sc.nextInt();
			zaW[i] = sc.nextInt();
			F[zaH[i]][zaW[i]] = 1;
		}

		int zaHBK[] = new int[M];
		int zaWBK[] = new int[M];

		for(int i=0; i< M; i++) {
			zaHBK[i] = zaH[i];
			zaWBK[i] = zaW[i];
		}

		Arrays.sort(zaH);
		Arrays.sort(zaW);

		int HMax = 1;
		int WMax = 1;

		int BH = zaH[0];
		int BW = zaW[0];

		List<Integer> BSH = new ArrayList<Integer>();
		List<Integer> BSW = new ArrayList<Integer>();
		BSH.add(zaH[0]);
		BSW.add(zaW[0]);

		int HNow = 1;
		int WNow = 1;

		for(int i=1; i< M; i++) {
			if(zaH[i] == zaH[i-1]) {
				HNow++;
			} else {
				if(HMax < HNow) {
					HMax = HNow;
					BSH.clear();
					BSH.add(zaH[i-1]);
				} else if(HMax == HNow) {
					BSH.add(zaH[i-1]);
				}
				HNow = 1;
			}

			if(zaW[i] == zaW[i-1]) {
				WNow++;
			} else {
				if(WMax < WNow) {
					WMax = WNow;
					BSW.clear();
					BSW.add(zaW[i-1]);
				} else if(WMax == WNow) {
					BSW.add(zaW[i-1]);
				}
				WNow = 1;
			}
		}

		if(HMax < HNow) {
			HMax = HNow;
			BSH.clear();
			BSH.add(zaH[M-1]);
		} else if(HMax == HNow) {
			BSH.add(zaH[M-1]);
		}
		if(WMax < WNow) {
			WMax = WNow;
			BSW.clear();
			BSW.add(zaW[M-1]);
		} else if(WMax == WNow) {
			BSW.add(zaW[M-1]);
		}

		int x = 1;

		for(int seeH: BSH) {
			for(int seeW: BSW) {
				if(F[seeH][seeW] == 0) {
					x = 0;
					break;
				}
			}
			if(x == 0) {
				break;
			}
		}

		System.out.println(HMax + WMax - x);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
