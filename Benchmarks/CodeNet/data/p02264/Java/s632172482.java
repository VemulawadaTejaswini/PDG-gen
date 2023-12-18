import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] head = str.split(" ", 2);
		int n = Integer.parseInt(head[0]); // ????????????????????°
		int q = Integer.parseInt(head[1]); // ???????????????
		str = br.readLine();
		List<String> name = new ArrayList<>();
		List<Integer> time = new ArrayList<>();
		int top = 0;
		int end = 0;
		int clock = 0;
		for (int i = 0; i < n; i++) {
			String[] data = str.split(" ", 2);
			name.add(data[0]);
			time.add(Integer.parseInt(data[1]));
			end++;
			str = br.readLine();
		}
		while (top == 0 || top != end) {
			if (time.get(top) > q) {
				time.add(time.get(top) - q);
				name.add(name.get(top));
				top++;
				end++;
				clock = clock + q;
			} else {
				clock = clock + time.get(top);
				System.out.println(name.get(top) + " " + clock);
				top++;
			}
		}
	}
}