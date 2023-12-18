import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		double l, w, h, n, r, lw, wh, hl,minside;

		for(;;){
			l = sc.nextInt();
			w = sc.nextInt();
			h = sc.nextInt();
			if((l == 0) && (w == 0) && (h == 0)) break;
			n = sc.nextDouble();

			lw = Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2));
			wh = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
			minside = Math.min(lw, wh);
			hl = Math.sqrt(Math.pow(h, 2) + Math.pow(h, l));
			minside = Math.min(minside, hl);

			for(int i = 0; i < n; i++){
				r = sc.nextDouble();
				if(minside < r * 2) System.out.println("OK");
				else System.out.println("NA");
			}
		}
	}
}