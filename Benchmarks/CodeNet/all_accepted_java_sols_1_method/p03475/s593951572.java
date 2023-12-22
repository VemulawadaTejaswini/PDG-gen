import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		List<Integer> C = new ArrayList<Integer>();
		List<Integer> S = new ArrayList<Integer>();
		List<Integer> F = new ArrayList<Integer>();

		for (int i = 0; i < N - 1; i++) {
			String[] get = br.readLine().split(" ");
			C.add(Integer.parseInt(get[0]));
			S.add(Integer.parseInt(get[1]));
			F.add(Integer.parseInt(get[2]));
		}

		Stack time = new Stack();
		time.push(0);

		int now = 0;
		for (int n = 0; n < N ; n++) {
			now = 0;
			for (int i = n; i < N - 1; i++) {
				if (now < S.get(i))
					now = S.get(i);

				while (now % F.get(i) != 0) {
					now++;
				}

				now += C.get(i);

			}
			System.out.println(now);
		}

	}
}