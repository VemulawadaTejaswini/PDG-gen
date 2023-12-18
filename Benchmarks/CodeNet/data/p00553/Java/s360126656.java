import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			int D = Integer.parseInt(br.readLine());
			int E = Integer.parseInt(br.readLine());

			int cost = 0;
			int current = A;
			if (current<=0) {
				cost += (-1)*current*C+D+B*E;
			} else {
				cost += (B-current)*E;
			}
			System.out.println(cost);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

