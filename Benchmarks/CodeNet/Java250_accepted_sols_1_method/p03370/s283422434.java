
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int X = Integer.parseInt(tmp[1]);

		List<Integer> m = new ArrayList<Integer>();
		int oneDo = 0;
		for (int n = 0; n < N; n++) {
			m.add(Integer.parseInt(br.readLine()));
			oneDo += m.get(n);
		}

		X -= oneDo;
		int count = N;

		m.sort(null);

		int min = m.get(0);

		while(X >= min){
			X -= min;
			count++;
		}

		System.out.println(count);


	}


}
