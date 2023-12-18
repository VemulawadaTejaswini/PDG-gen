import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class t implements Comparable<t> {

		int worth;

		int weight;



		t(String s) {

			Scanner sc = new Scanner(s.replace(',', ' '));

			worth = sc.nextInt();

			weight = sc.nextInt();

		}



		public int compareTo(t o) {

			return this.weight - o.weight;

		}

	}



	void run() {

		for (int casea = 1;; casea++) {

			int w = sc.nextInt();

			if (w == 0) {

				break;

			}

			int n = sc.nextInt();

			t[] d = new t[n];

			for (int i = 0; i < n; i++) {

				d[i] = new t(sc.next());

			}

			Arrays.sort(d);

			int[] dp = new int[w];

			for(int i= 0 ; i < n;i++){

				int[] dp2 = dp.clone();

				for(int j = 0; j+d[i].weight < w; j++){

					dp[j+d[i].weight] = Math.max(dp2[j+d[i].weight-1],dp2[j]+d[i].worth);

				}

			}

			int trig = 0;

			int max = 0;

			for(int i = 0; i < w;i++){

				if(max < dp[i]){

					max = dp[i];

					trig = i;

				}

			}

			System.out.println("Case "+ casea + ":");

			System.out.println(max);

			System.out.println(trig);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();



	}

}