// CatChecker
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			List<Tree> list = new ArrayList<Tree>();
			for (int i = 0; i < n; i++) {
				String str = scanner.next().replace(".", "");
				String[] strs = str.split(":");
				String[] namesArray = strs[1].split(",");
				List<String> namesList = new ArrayList<String>();
				for (String name : namesArray) {
					namesList.add(name);
				}
				list.add(new Tree(strs[0], namesList));
			}
			Queue<Tree> queue = new LinkedList<Tree>();
			Set<String> set = new HashSet<String>();
			queue.add(list.get(0));
			while (!queue.isEmpty()) {
				Tree tree = queue.poll();
				if (set.contains(tree.group))
					set.remove(tree.group);
				for (String name : tree.member) {
					for (int i = 0; i < list.size(); i++) {
						if (name.equals(list.get(i).group)) {
							queue.add(list.get(i));
						}
					}
					set.add(name);
				}
			}
			System.out.println(set.size());
		}
		scanner.close();
	}
}

class Tree {
	String group;
	List<String> member;

	Tree(String g, List<String> m) {
		group = g;
		member = m;
	}
}