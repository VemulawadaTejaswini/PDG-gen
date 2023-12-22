import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int m = sc.nextInt();/* 受験者数 */
			int n_min = sc.nextInt();/* 最低合格者数 */
			int n_max = sc.nextInt();/* 最高合格者数 */
			if(m == 0) break;
			
			int[] score = new int[m];
			for(int i = 0; i < m; i++) score[i] = sc.nextInt();
			
			int gap_max = 0;/* 差は最小より低く初期化 */
			int NoSC = n_min;/* number of successful candidates */
			for(int i = n_min; i <= n_max; i++) {
				int gap = score[i-1] - score[i];
				if(gap > gap_max) {
					gap_max = gap;
					NoSC = i;
				}else if(gap == gap_max) {
					NoSC = i;
				}
			}
			System.out.println(NoSC);
		}
	}

}

