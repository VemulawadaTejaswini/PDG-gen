import java.util.*;

class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		//TreeMapでソートして格納する
		Map<String, Integer> map = new TreeMap<>();
		int max = 1;
 
		for (int i = 0; i < n; i++) {
			String S = sc.next();
			
			//同じものが含まれていなければmapにSと値1を代入
			//同じものが含まれていたら値に+1をして
			//Math.maxで比較してmaxに代入する
			if (map.containsKey(S)) {
				map.put(S, map.get(S) + 1);
				max = Math.max(max, map.get(S));
			} else {
				map.put(S, 1);
			}
		}
		//max値とキーの値が等しければそのキーを出力
		for (String key : map.keySet()) {
			if (max == map.get(key)) {
				System.out.println(key);
			}
		}
	}
} 