

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			int i, j, max = 0, tmp = 0;
			int[] num = new int[5001];
			if(n == 0) {
				break;
			}
			for(i = 0; i < n; i++) {
				num[i] = Integer.parseInt(sc.next());
			}
			max =  num[0];
			for(i = 0; i < n; i++) {
				for(j = i; j < n; j++) {
					tmp += num[j];
					if(max < tmp) {
						max = tmp;
					}
				}
				tmp = 0;
			}
			System.out.println(max);

		}
		sc.close();


	}

}

