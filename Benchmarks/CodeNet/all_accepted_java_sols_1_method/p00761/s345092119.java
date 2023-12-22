import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int A0 = stdIn.nextInt();
			int L = stdIn.nextInt();
			if(A0 == 0 && L == 0) break;
			int[] ar = new int[21];
			ar[0] = A0;
			for (int i = 0; i < 20; i++) {
				int pre1 = ar[i];
				String pre2 = String.valueOf(pre1);
				String pre2X = String.valueOf(pre1);
				while (pre2.length() < L) {
					pre2 = "0" + pre2;
				}
				String pre3 = "";
				String pre4 = "";
				IN:for (int j = 0; j < pre2.length(); j++) {
					for (int k = 9; k >= 0; k--) {
						for (int l = 0; l < pre2.length(); l++) {
							if (pre2.charAt(l) == String.valueOf(k).charAt(0)) {
								pre3 += String.valueOf(k);
								String tmp1 = pre2.substring(0, l);
								String tmp2 = pre2.substring(l + 1,
										pre2.length());
								pre2 = tmp1 + "0" + tmp2;
								continue IN;
							}
						}
					}
				}
				
				pre2 = pre2X;
				IN:for (int j = 0; j < pre2.length(); j++) {
					for (int k = 0; k <= 9; k++) {
						for (int l = 0; l < pre2.length(); l++) {
							if (pre2.charAt(l) == String.valueOf(k).charAt(0)) {
								pre4 += String.valueOf(k);
								String tmp1 = pre2.substring(0, l);
								String tmp2 = pre2.substring(l + 1,
										pre2.length());
								pre2 = tmp1 + "9" + tmp2;
								continue IN;
							}
						}
					}
				}
				int p5 = Integer.parseInt(pre3);
				int p6 = Integer.parseInt(pre4);
				ar[i + 1] = p5 - p6;
			}
			int jAns = 0;
			int ajAns = 0;
			int ijAns = 0;
			IN:for(int j = 0; j < 21; j++) {
				for(int i = j+1; i < 21; i++) {
					if(ar[i] == ar[j]) {
						jAns = j;
						ajAns = ar[j];
						ijAns = i - j;
						break IN;
					}
				}
			}
			System.out.println(jAns + " " + ajAns + " " + ijAns);
		}
		
	}
}