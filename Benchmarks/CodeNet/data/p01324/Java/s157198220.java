import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pattern pt = Pattern.compile("10\\^(-?[0-9]+)");
		Matcher mc = pt.matcher("");
		List<String> unitList = new ArrayList<String>();
		int n;
		while (in.hasNext()) {
			n = in.nextInt();
			if (n == 0) {
				break;
			}
			unitList.clear();
			Integer[][] data = new Integer[n * 2][n * 2];
			int size = 0;
			String unit1, unit2;
			Integer x;
			boolean yes = true;
			for (int i = 0; i < n; i++) {
				in.next();
				unit1 = String.valueOf(in.next());
				in.next();
				mc.reset(in.next()).matches();
				x = Integer.valueOf(mc.group(1));
				unit2 = String.valueOf(in.next());
				if (yes) {
					if (!unitList.contains(unit1)) {
						unitList.add(unit1);
						int num = size++;
						data[num][num] = Integer.valueOf(0);
					}
					if (!unitList.contains(unit2)) {
						unitList.add(unit2);
						int num = size++;
						data[num][num] = Integer.valueOf(0);
					}
					final int from = unitList.indexOf(unit1);
					final int to = unitList.indexOf(unit2);
					int max = Math.max(from, to);
					a: for (int a = 0; a <= max; a++) {
						Integer pickVal = data[to][a];
						if (pickVal != null) {
							Integer newVal = Integer.valueOf(pickVal + x);
							if (data[from][a] != null
									&& !data[from][a].equals(newVal)) {
								yes = false;
								break;
							}
							for (int c = 0; c < a; c++) {
								if (newVal.equals(data[from][c])) {
									yes = false;
									break a;
								}
							}
							data[from][a] = newVal;
							data[a][from] = Integer.valueOf(-newVal);
						}
					}
				}
			}

			System.out.println(yes ? "Yes" : "No");
		}
	}
}