import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
//		int[] lines = new int[n];
		List<Integer> line = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
//			lines[i] = sc.nextInt();
			line.add(sc.nextInt());
		}
		Collections.sort(line);
		
		int ans = 0;
		Integer one = null;
		Integer two = null;
		Integer three = null;
		for (int i = 0; i < line.size(); i++) {
			one = line.get(i);
			for (int j = i + 1; j < line.size(); j++) {
				if (one.intValue() == line.get(j).intValue()) {
					continue;
				}
				two = line.get(j);
				for (int k = j +1; k < line.size(); k++) {
					if (two.intValue() == line.get(k).intValue()) {
						continue;
					}
					three = line.get(k);
					if (one.intValue() + two.intValue() > three.intValue()) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		
	}
}
