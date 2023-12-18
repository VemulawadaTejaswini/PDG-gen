import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

	private static int n;
	private static int cnt = 30;
	private static int maxN = 3;
	private static List<Integer> p_List;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		p_List = new ArrayList<Integer>();
		p_List.add(2);
		p_List.add(3);
		while ((line = br.readLine()) != null && cnt-- > 0) {
			int p_num = 0;
			n = Integer.parseInt(line);

			// (Re)calc prime number list
			if (maxN < n) {
				for (int i = maxN; i <= n; i++) {

					if (i % 2 == 0) {
						continue;
					}
					boolean isPnum = true;
					for (int j = 0; j < p_List.size() && p_List.get(j) < i; j++) {
						if (i % p_List.get(j) == 0) {
							isPnum = false;
							break;
						}
					}
					if (isPnum) {
						p_List.add(i);
					}
				}
				maxN = n;
			}

			for (int i = 2; i <= n; i++) {
				if (p_List.indexOf(i) != -1) {
					p_num++;
				}
			}
			System.out.println(p_num);
		}
	}
}