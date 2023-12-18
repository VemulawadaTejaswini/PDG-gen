

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			int i, j, k, max = 0, tmp = 0;
			int[] num = new int[5001];
			if(n == 0) {
				break;
			}
			for(i = 0; i < n; i++) {
				num[i] = Integer.parseInt(sc.next());
			}
			for(i = 0; i < n; i++) {
				for(j = 0; j < n; j++) {
					for(k = i; k < j + 1; k++) {
						tmp += num[k];
					}
					if(max < tmp) {
						max = tmp;
					}
					tmp = 0;
				}
			}
			System.out.println(max);

		}
		sc.close();


	}

}

