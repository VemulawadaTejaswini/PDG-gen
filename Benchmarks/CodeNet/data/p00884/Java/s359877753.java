import java.util.*;
public class Main {
	static Data[] data;
	static HashMap<String,Integer> groupName;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			data = new Data[n];
			groupName = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String[] in = sc.next().split(":|,|\\.");
				data[i] = new Data(in[0]);
				groupName.put(in[0], i);
				for (int j = 1; j < in.length; j++) {
					data[i].list.add(in[j]);
				}
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				HashMap<String, Boolean> alCount = new HashMap<String, Boolean>();
				int ret = DFS(0, alCount);
				max = Math.max(ret, max);
			}
			System.out.println(max);
		}
	}
	static int DFS(int a, HashMap<String,Boolean> alCount) {
		int ret = 0;
		for(int i = 0; i < data[a].list.size(); i++) {
			if(alCount.containsKey(data[a].list.get(i))) continue;
			alCount.put(data[a].list.get(i), true);
			if(groupName.containsKey(data[a].list.get(i))) ret += DFS(groupName.get(data[a].list.get(i)),alCount);
			else {
				ret++;
			}
		}
		return ret;
	}
	
	static class Data {
		String groupName;
		ArrayList<String> list = new ArrayList<String>();
		Data(String a) {
			groupName = a;
		}
	}
	
}