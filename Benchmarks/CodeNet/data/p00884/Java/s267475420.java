import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			String firstGroup = "";

			Map<String, ArrayList<String>> groups = new HashMap<String, ArrayList<String>>();
			for (int z = 0; z < n; z++) {
				String line = sc.next();
				String group = line.split(":")[0];
				if (z == 0) {
					firstGroup = group;
				}
				groups.put(group, new ArrayList<String>());
				String[] members = line.split(":")[1].split(",");
				for (int i = 0; i < members.length; i++) {
					groups.get(group).add(
							members[i].trim().replaceAll("\\.", ""));
				}
			}

			ArrayList<String> ansList = new ArrayList<String>();
			Deque<String> deque = new ArrayDeque<String>();
			deque.add(firstGroup);
			while (!deque.isEmpty()) {
				String person = deque.poll();
				if (groups.get(person) == null && !ansList.contains(person)) {
					ansList.add(person);
				} else if (groups.get(person) != null) {
					// personがグループ名の時
					for (String child : groups.get(person)) {
						deque.add(child);
					}
				}
			}

			System.out.println(ansList.size());

		}
	}
}