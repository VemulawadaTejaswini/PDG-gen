import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

/**
 * @author yoshikyoto
 */
class Main {
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(solve(n));
		}
	}
	
	static int solve(int n) {
		HashMap<String, ArrayList<Integer>> timeMap = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			int m = toMinutes(sc.next(), sc.next());
			String io = sc.next();
			String id = sc.next();
			if(!timeMap.containsKey(id)) {
				timeMap.put(id, new ArrayList<Integer>());
			}
			timeMap.get(id).add(m);
		}
		if(!timeMap.containsKey("000")) {
			return 0;
		}
		ArrayList<Integer> goddessList = timeMap.get("000");
		
		int ans = 0;
		for(String id : timeMap.keySet()) {
			if(id.equals("000")) continue;
			ArrayList<Integer> list = timeMap.get(id);
			
			int sum = 0;
			for (int i = 0; i < list.size(); i+=2) {
				for (int j = 0; j < goddessList.size(); j+=2) {
					int start = Math.max(goddessList.get(j), list.get(i));
					int end = Math.min(goddessList.get(j+1), list.get(i+1));
					int time = end - start;
					if(time > 0) {
						sum += time;
					}
				}
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}
	
	static int toMinutes(String str1, String str2) {
		String[] month_date = str1.split("/");
		String[] hour_minute = str2.split(":");
		int month = Integer.valueOf(month_date[0]);
		int date = Integer.valueOf(month_date[1]);
		int hour = Integer.valueOf(hour_minute[0]);
		int minute = Integer.valueOf(hour_minute[1]);
		int ans = minute + hour * 60 + date * 24 * 60 + month * 31 * 24 * 60;
		return ans;
	}
}