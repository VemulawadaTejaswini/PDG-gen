import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	Scanner in = new Scanner(System.in);
	HashMap<String, String[]> hash = new HashMap<String, String[]>();
	HashSet<String> ans = new HashSet<String>();
	int n;
	
	void makeHashSet(String target) {
		int res = 0;
		
		String[] groupMem = hash.get(target);
		for (int i = 0; i < groupMem.length; i++) {
			String nextMem = groupMem[i];
			if (nextMem == null) break;
			if (hash.containsKey(nextMem)) {
				makeHashSet(nextMem);
			} else {
				ans.add(nextMem);
			}
		}
	}
	
	public void run() {
		while (true) {
			String target = "";
			n = in.nextInt();
			if (n == 0) break;
			ans.clear(); hash.clear();
			for (int i = 0; i < n; i++) {
				String s = in.next();
				s = s.replace(':', ' ');
				s = s.replace(',', ' ');
				s = s.replace('.', ' ');
				StringTokenizer st = new StringTokenizer(s);
				String groupName = st.nextToken();
				if (i == 0) target = groupName.toString();
				String[] member = new String[100];
				for (int j = 0; st.hasMoreElements(); j++) {
					String nextMember = st.nextToken();
					member[j] = nextMember.toString();
				}
				hash.put(groupName, member);
			}
			
			makeHashSet(target);
			System.out.println(ans.size());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}