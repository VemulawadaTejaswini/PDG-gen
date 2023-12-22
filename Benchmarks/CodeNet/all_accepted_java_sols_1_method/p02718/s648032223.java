import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, cnt = 0;
		String[] n = new String[2];
		String[] e = null;
		List<Integer> list = new ArrayList<>();
		List<Integer> eleList = new ArrayList<>();
		n = br.readLine().split(" ");
		list.add(Integer.parseInt(n[0]));list.add(Integer.parseInt(n[1]));
		e = new String[list.get(0)];
		e = br.readLine().split(" ");
		Arrays.sort(e);
		for (int i = 0; i < list.get(0); i++) {
			eleList.add(Integer.parseInt(e[ i ]));
			sum += eleList.get(i);
		}
		for (int i = 0; i < list.get(0); i++) {
			if ((double) sum / (4 * list.get(1)) <= eleList.get(i))
				cnt++;
		}
		System.out.println(list.get(1) <= cnt ? "Yes" : "No");
	}
}
