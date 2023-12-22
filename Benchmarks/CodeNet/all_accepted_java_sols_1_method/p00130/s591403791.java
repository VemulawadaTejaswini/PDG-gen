import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private static final String LEFT = "<-";
	private static final String RIGHT = "->";

	public static void main(String[] args) {
		Pattern pt = Pattern.compile("(->|<-)?([a-z])");
		Matcher matcher = pt.matcher("");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			matcher.reset(in.next());
			Deque<String> densya = new LinkedList<String>();
			String pre = null;
			while (matcher.find()) {
				String arrow = matcher.group(1);
				String syaryo = matcher.group(2);
				if (pre == null) {
					densya.add(syaryo);
				} else if (RIGHT.equals(arrow) && densya.peekLast().equals(pre)) {
					densya.addLast(syaryo);
				} else if (LEFT.equals(arrow) && densya.peekFirst().equals(pre)) {
					densya.addFirst(syaryo);
				}
				pre = syaryo;
			}
			for (String s : densya) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}