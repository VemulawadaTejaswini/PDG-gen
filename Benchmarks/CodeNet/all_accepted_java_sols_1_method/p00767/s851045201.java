import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			ArrayList<Integer> hs = new ArrayList<>();
			ArrayList<Integer> ws = new ArrayList<>();
			ArrayList<Integer> ds = new ArrayList<>();
			for (int i = 1; i <= 150; i++) {
				for (int j = 2; j <= 150; j++) {
					if (i < j) {
						hs.add(i);
						ws.add(j);
						ds.add(i * i + j * j);
					}
				}
			}
			while (true) {
				String s[] = br.readLine().split(" ");
				int h = Integer.parseInt(s[0]);
				int w = Integer.parseInt(s[1]);
				if (h == 0 && w == 0)
					break;
				int d = w * w + h * h;
				int minh = 1000;
				int mind = 100000;
				int minid = 0;
				ArrayList<Integer> okds = new ArrayList<>();
				for (int i = 0; i < ds.size(); i++) {
					if (d <= ds.get(i) && h != hs.get(i)) {
						if (mind == ds.get(i)) {
							okds.add(i);
						} else if (mind > ds.get(i)) {
							if (ds.get(i) == d) {
								if (h < hs.get(i)) {
									okds.clear();
									okds.add(i);
									mind = ds.get(i);
								}
							} else {
								okds.clear();
								okds.add(i);
								mind = ds.get(i);
							}
						}
					}
				}
				for (int i = 0; i < okds.size(); i++) {
					if (mind == d) {
						if (h < hs.get(okds.get(i))) {
							minh = Math.min(minh, hs.get(okds.get(i)));
							if (minh == hs.get(okds.get(i))) {
								minid = okds.get(i);
							}
						}
					} else {
						minh = Math.min(minh, hs.get(okds.get(i)));
						if (minh == hs.get(okds.get(i))) {
							minid = okds.get(i);
						}
					}
				}
				System.out.println(hs.get(minid) + " " + ws.get(minid));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
