import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
	enum marks {
		S, H, C, D;
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int n = Integer.parseInt(br.readLine());
			TreeSet<String> cardSet = new TreeSet<String>(
					new Comparator<String>() {
						@Override
						public int compare(String o1, String o2) {
							int flg;
							flg = marks.valueOf(o1.split("\\s")[0]).compareTo(
									marks.valueOf(o2.split("\\s")[0]));
							if (flg == 0) {
								return Integer.parseInt(o1.split("\\s")[1])
										- Integer.parseInt(o2.split("\\s")[1]);
							} else {
								return flg;
							}
						}
					});
			String[] marks = new String[] { "S", "H", "C", "D" };

			for (String mark : marks) {
				for (int i = 1; i <= 13; i++) {
					cardSet.add(mark + " " + i);
				}
			}

			for (int i = 0; i < n; i++) {
				cardSet.remove(br.readLine());
			}
			for (String str : cardSet) {
				System.out.println(str);
			}
			
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}