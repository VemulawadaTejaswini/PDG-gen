
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.next();
			if (line.equals("0"))
				break;
			Pattern pattern = Pattern.compile("^r+$|^g+$|^b+$");
			Deque<String> deque = new ArrayDeque<String>();
			Set<String> set = new HashSet<String>();
			deque.offer(line);
			boolean flag = false;
			int step = 0;
			loop: while (!deque.isEmpty()) {
				int size = deque.size();
				for (int i = 0; i < size; i++) {
					String tmp = deque.pop();
					if (pattern.matcher(tmp).find()) {
						flag = true;
						break loop;
					}
					if (!set.contains(tmp)) {
						set.add(tmp);
						char[] chs = tmp.toCharArray();
						for (int j = 0; j < chs.length - 1; j++) {
							char l = chs[j];
							char r = chs[j + 1];
							if (l != r) {
								char[] tmpchs = Arrays.copyOf(chs, chs.length);
								if (l != 'r' && r != 'r')
									tmpchs[j] = tmpchs[j + 1] = 'r';
								else if (l != 'g' && r != 'g')
									tmpchs[j] = tmpchs[j + 1] = 'g';
								else {
									tmpchs[j] = tmpchs[j + 1] = 'b';
								}
								deque.offer(String.valueOf(tmpchs));
							}
						}
					}
					
				}
				step++;
			}
			System.out.println(flag ? step : "NA");
		}
	}
}