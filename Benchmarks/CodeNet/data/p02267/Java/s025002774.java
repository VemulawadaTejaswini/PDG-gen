import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(str[i]));
		}
		int q = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		str = br.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			list.add(Integer.parseInt(str[i]));
		}
		int count = 0;
		for (Integer i : list) {
			for (Integer j : set) {
				if(i.intValue() == j.intValue()) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
