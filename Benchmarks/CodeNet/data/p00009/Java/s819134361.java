import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		while (null != (line = br.readLine())) {
			int n = Integer.parseInt(line.trim());
			List<Integer> L = new ArrayList<Integer>();
			for (int i = 2 ; i <= n ; i++) {
				L.add(i);
			}
			List<Integer> P = new ArrayList<Integer>();
			while (!L.isEmpty()) {
				int i = L.get(0);
				P.add(i);
				for (Iterator<Integer> it = L.iterator() ; it.hasNext() ;) {
					Integer I = it.next();
					if (I % i == 0) it.remove();
				}
			}
			System.out.println(""+P.size());
		}
	}
}