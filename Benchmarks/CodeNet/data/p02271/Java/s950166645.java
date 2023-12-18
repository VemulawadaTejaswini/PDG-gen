import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static boolean solve(int i, int x, List<Integer> list) {
		if(x == 0) {
			return true;
		} else if (i >= list.size() || x < 0) {
			return false;
		} else {
			return(solve(i + 1, x, list)) || solve(i + 1, x - list.get(i), list);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		String[] strings = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(strings[i]));
		}
		int q = Integer.parseInt(br.readLine());
		strings = br.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			if(solve(0, Integer.parseInt(strings[i]), list)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
