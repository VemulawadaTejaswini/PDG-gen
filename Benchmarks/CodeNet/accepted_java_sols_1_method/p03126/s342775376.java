import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = parseInt(st.nextToken());
		int M = parseInt(st.nextToken());
		boolean[] foods = new boolean[M];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int K = parseInt(st.nextToken());

			List<Integer> indexList= new ArrayList<>();

			for(int j=0;j<K;j++) {
				int n = parseInt(st.nextToken());
				if(i==0) {
					foods[n-1] = true;
				}
				indexList.add(n);
			}

			for(int x=0;x<foods.length;x++) {
				if(foods[x] == true) {
					if(indexList.indexOf(x+1) == -1) {
						foods[x] = false;
					}
				}
			}

		}

		int sum = 0;
		for(int x=0;x<foods.length;x++) {
			if(foods[x] == true) {
				sum ++;
			}
		}

		System.out.println(sum);

	}
}
