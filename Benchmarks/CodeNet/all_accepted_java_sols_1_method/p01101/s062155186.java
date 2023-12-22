

import java.util.Scanner;

public class Main {

	static int n;
	static int money;
	static int sub[];
	static int total;
	static int dfs[] = new int[1000];
	static int k = 0;
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		while(true) {
			n = sr.nextInt();
			money = sr.nextInt();
			//System.out.println(money);
			if(n == 0) break;
			sub = new int[n];

			for (int i = 0; i < n; i++) {

				sub[i] = sr.nextInt();
			}
			int max = 0;
			for(int i = 0; i < n; i++) {

				for(int j = i+1; j < n; j++) {
					total = sub[i] + sub[j];
					//System.out.println(total);
					if(max < total) {
						if(total <= money) {
							//System.out.println(total);
							max = total;
						}


					}
				}
			}
			if(max ==0) System.out.println("NONE");
			else System.out.println(max);

		}
	}


}

