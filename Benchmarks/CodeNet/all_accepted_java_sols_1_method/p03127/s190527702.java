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
		TreeSet<Integer> ts = new TreeSet<Integer>();


		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			ts.add(parseInt(st.nextToken()));
		}

		while(true) {
			if(ts.size() == 1) {
				break;
			}
			int newLast = ts.last() % ts.first();
			ts.remove(ts.last());

			if(newLast !=0) {
				ts.add(newLast);
			}


		}

		System.out.println(ts.first());
	}
}
