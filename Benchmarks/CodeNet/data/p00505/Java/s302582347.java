import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			int count[] = new int[4];
			while (true) {
				buf = br.readLine();
				System.out.println(buf);
				StringTokenizer st = new StringTokenizer(buf, " ");
				ArrayList<Integer> e = new ArrayList<Integer>();
				for (int i=0;i<3;i++) {
					e.add(Integer.parseInt(st.nextToken()));
				}
				Collections.sort(e);
				if (e.get(0)+e.get(1)<=e.get(2)) {
					System.out.println(count[0]+" "+count[1]+" "+count[2]+" "+count[3]);
					break;
				} else if (e.get(0)*e.get(0)+e.get(1)*e.get(1)==e.get(2)*e.get(2)) {
					count[1]++;
				} else if (e.get(0)*e.get(0)+e.get(1)*e.get(1)>e.get(2)*e.get(2)) {
					count[2]++;
				} else {
					count[3]++;
				}
				count[0]++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

