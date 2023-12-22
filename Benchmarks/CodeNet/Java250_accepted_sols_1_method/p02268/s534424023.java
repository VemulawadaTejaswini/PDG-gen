import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> s = new ArrayList<>();
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			s.add(Integer.parseInt(str[i]));
		}
		int q = Integer.parseInt(br.readLine());
		List<Integer> t = new ArrayList<>();
		str = br.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			t.add(Integer.parseInt(str[i]));
		}
		int count = 0;
		for (Integer i : t) {
			int left = 0;
			int right = s.size() - 1;
			int mid = (left + right) / 2;
			while(left <= right) {
				if(i.intValue() == s.get(mid).intValue()) {
					count++;
					break;
				} else if (i.intValue() < s.get(mid).intValue()) {
					right = mid - 1;
					mid = (left + right) / 2;
				} else {
					left = mid + 1;
					mid = (left + right) / 2;
				}
			}
		}
		System.out.println(count);
	}
}
