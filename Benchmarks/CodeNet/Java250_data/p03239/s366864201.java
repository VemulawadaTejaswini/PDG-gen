import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = parseInt(st.nextToken());
		int T = parseInt(st.nextToken());
//		int[] c = new int[N];
//		int[] t = new int[N];

		TreeSet<Integer> set = new TreeSet<Integer>();

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int c = parseInt(st.nextToken());
			int t = parseInt(st.nextToken());
			if(t <= T) {
				set.add(c);
			}
		}

		if(set.isEmpty()) {
			System.out.println("TLE");

		}else {
			System.out.println(set.first());

		}



	}




}