

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int d = sc.nextInt();

			if(w == 0 && d == 0){
				break;
			}

//			int[] hw = new int[w];
//			int[] hd = new int[d];
			int[] countw = new int[21];
			int[] countd = new int[21];

			for(int i = 0; i < w; i++){
//				hw[i] = sc.nextInt();
				countw[sc.nextInt()]++;
			}

			for(int i = 0; i < d; i++){
//				hd[i] = sc.nextInt();
				countd[sc.nextInt()]++;
			}

//			Arrays.sort(hw);
//			Arrays.sort(hd);

			int result = 0;
			for(int i = 1; i <= 20; i++){
				result += Math.max(countw[i], countd[i])*i;
			}

			System.out.println(result);
		}
	}

}

