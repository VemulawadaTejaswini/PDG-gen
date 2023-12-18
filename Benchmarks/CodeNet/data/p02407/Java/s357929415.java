import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			List<Integer> list = new ArrayList<Integer>();
			for (String text : Arrays.asList(br.readLine().split(" "))) {
				list.add(Integer.parseInt(text));
			}
			Collections.sort(list);
			Collections.reverse(list);
			int i;
			String ret = "";
			for (i = 0; i < list.size(); i++) {
				if (i == 0) {
					ret = ret + list.get(i);
				} else {
					ret = ret + " " + list.get(i);
				}
			}
			System.out.println(ret);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}