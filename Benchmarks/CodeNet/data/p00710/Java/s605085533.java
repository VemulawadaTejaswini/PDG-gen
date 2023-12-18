import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String flag = br.readLine();
		List<String> pickUP = new LinkedList<String>();
		LinkedList<String> cards = new LinkedList<String>();
		while (!"0 0".equals(flag)) {
			cards.clear();
			int space = flag.indexOf(" ");
			int n = Integer.parseInt(flag.substring(0, space));
			int r = Integer.parseInt(flag.substring(space - 1));
			for (int i = 0; i < n; i++) {
				cards.addFirst(Integer.toString(i + 1));
			}
			for (int i = 0; i < r; i++) {
				String num = br.readLine();
				space = num.indexOf(" ");
				pickUP.clear();
				int from = Integer.parseInt(num.substring(0, space)) - 1;
				int to = Integer.parseInt(num.substring(space - 1)) + from;
				List<String> subList = cards.subList(from, to);
				pickUP.addAll(subList);
				subList.clear();
				cards.addAll(0, pickUP);
			}
			System.out.println(cards.peekFirst());
			flag = br.readLine();
		}
	}
}