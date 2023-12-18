import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (;;) {

			int m = sc.nextInt();

			int c = sc.nextInt();

			if((m|c)==0)break;

			int j = 0;

			boolean[] visited = new boolean[m];

			int count = 0;

			int e=0;

			for (int i = 0;count < m; i++, i=i<m?i:0) {

				if (visited[i])

					continue;

				j++;

				if (j == c) {

					visited[i] = true;

					count++;

					j = 0;

					e=i;

				}

			}

			System.out.println(e+1);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}