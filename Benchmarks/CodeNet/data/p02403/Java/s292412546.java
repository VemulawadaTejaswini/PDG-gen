public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int l =0;
		int [][] ar = new int[0][2];
		int [][] arc = new int[0][2];
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 && w == 0) {
				break;
			}
			l++;
			ar = new int[l][2];
			for (int i = 0; i < l - 1; i++) {
				ar[i] = arc[i];
			}
			ar[l - 1] = new int[] { h, w };
			arc = new int[l][2];
			for (int i = 0; i < l; i++) {
				arc[i] = ar[i];
			}
		}

		for (int i = 0; i < ar.length; i++) {
			int h = ar[i][0];
			int w = ar[i][1];

			String sYoko = "";
			for (int j = 0; j < w; j++) {
				sYoko = sYoko + "#";
			}
			//String sHako = "";
			for (int j = 0; j < h; j++) {
				//sHako = sHako + sYoko + "\n";
				System.out.println(sYoko);
			}
			System.out.println();
		}
	}
}