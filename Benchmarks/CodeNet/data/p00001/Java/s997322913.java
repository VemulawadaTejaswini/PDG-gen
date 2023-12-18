import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		List<Integer> ls = new ArrayList<Integer>();
		try {
			while ((s = br.readLine()) != null) {
				ls.add(Integer.valueOf(s));
			}
			Collections.sort(ls);
			Collections.reverse(ls);
			for (int i = 0; i < 3; i++) {
				System.out.println(ls.get(i));
			}
		} catch (IOException e) {
		}
	}
}