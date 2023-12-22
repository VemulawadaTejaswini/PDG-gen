import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();

		int hPtn = (int) Math.pow(2, h);
		int wPtn = (int) Math.pow(2, w);

		String[] hSelect = new String[hPtn];
		String[] wSelect = new String[wPtn];

		for (int i=0; i<hPtn; i++){
			hSelect[i] = String.format("%" + h + "s", Integer.toBinaryString(i)).replace(" ", "0");
		}

		for (int i=0; i<wPtn; i++){
			wSelect[i] = String.format("%" + w + "s", Integer.toBinaryString(i)).replace(" ", "0");
		}


		char[][] mas = new char[h][w];

		int black = 0;
		for (int i=0; i<h; i++){
			String s = sc.next();
			for (int j=0; j<w; j++){
				mas[i][j] = s.charAt(j);
				if (mas[i][j] == '#'){
					black++;
				}
			}
		}

		int remain = black - k;
		long ans = 0;
		for (int i=0; i<hSelect.length; i++){
			for (int j=0; j<wSelect.length; j++){
				int paint = 0;
				for (int l = 0; l < h; l++){
					for (int m=0; m < w; m++){
						if (mas[l][m] == '#'){
							if (hSelect[i].charAt(l) == '1' || wSelect[j].charAt(m) == '1'){
								paint ++;
							}
						}
					}
				}
				if (remain == paint){
					ans++;
				}
			}
		}

		System.out.println(ans);
	}

}