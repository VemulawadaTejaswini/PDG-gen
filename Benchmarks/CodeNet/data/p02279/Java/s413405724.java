

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Main????????????test????°?????????????????????????????????£????????????version
//main?????§??????????????£??????????????????????????????(method)??????????????????????????????(StringBuffer)?????????????????????????????£

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer ans = method(br);
		System.out.print(ans);
	}

	
	public static StringBuffer method(BufferedReader br) throws IOException {

		int n = Integer.parseInt(br.readLine());
		StringBuffer ans = new StringBuffer();

		Map<Integer, Integer> parentMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> depthMap = new HashMap<Integer, Integer>();
		Map<Integer, StringBuffer> stringMap = new HashMap<Integer, StringBuffer>();

		int depth = 0;

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			if (i == 0) {
				if (n == 1) {
					ans.append("node " + str[0] + ": parent = " + -1 + ", depth = " + 0 + ", root, []" + "\n");
					break;
				}
				StringBuffer sb = new StringBuffer();
				int node = Integer.parseInt(str[0]);
				int m = Integer.parseInt(str[1]);
				int k = 2;
				sb.append("node " + node + ": parent = " + -1 + ", depth = " + 0 + ", root, [");

				for (int j = 0; j < m; j++) {
					parentMap.put(Integer.parseInt(str[k]), node);
					depthMap.put(Integer.parseInt(str[k]), (depth + 1));
					if (j == m - 1) {
						sb.append(Integer.parseInt(str[k]) + "]" + "\n");
						stringMap.put(node, sb);
						break;
					}
					sb.append(Integer.parseInt(str[k]) + ", ");
					k++;
				}
			} else if (str.length != 2) {
				StringBuffer sb = new StringBuffer();
				int node = Integer.parseInt(str[0]);
				int m = Integer.parseInt(str[1]);
				int k = 2;
				sb.append("node " + node + ": parent = " + parentMap.get(node) + ", depth = " + depthMap.get(node)
						+ ", internal node, [");
				for (int j = 0; j < m; j++) {
					parentMap.put(Integer.parseInt(str[k]), node);
					depthMap.put(Integer.parseInt(str[k]), (depthMap.get(node) + 1));
					if (j == m - 1) {
						sb.append(Integer.parseInt(str[k]) + "]" + "\n");
						stringMap.put(node, sb);
						break;
					}
					sb.append(Integer.parseInt(str[k]) + ", ");
					k++;
				}
			} else {
				StringBuffer sb = new StringBuffer();
				int node = Integer.parseInt(str[0]);
				sb.append("node " + node + ": parent = " + parentMap.get(node) + ", depth = " + depthMap.get(node)
						+ ", leaf, []" + "\n");
				stringMap.put(node, sb);
			}
		}
		if (n != 1) {
			for (int i = 0; i < n; i++) {
				ans.append(stringMap.get(i));
			}
		}
		return ans;
	}
}