import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.next();
			char type = sc.next().charAt(0);
			if (type == 'X') {
				break;
			}

			String[] words;

			if (s.indexOf('_') > -1) {
				words = s.split("_");
			}
			else {
				int start = 0;
				List<String> wordsTemp = new ArrayList<String>();
				for (int i = 1; i < s.length(); i++) {
					if (Character.isUpperCase(s.charAt(i))) {
						wordsTemp.add(s.substring(start, i));
						start = i;
					}
				}
				wordsTemp.add(s.substring(start));
				words = wordsTemp.toArray(new String[wordsTemp.size()]);
			}

			StringBuilder sb = new StringBuilder(s.length() + words.length);

			if (type == 'D') {
				sb.append(words[0].toLowerCase());
				for (int i = 1; i < words.length; i++) {
					sb.append('_').append(words[i].toLowerCase());
				}
			}
			else {
				if (type == 'L') {
					sb.append(words[0].toLowerCase());
				}
				for (int i = (type == 'L' ? 1 : 0); i < words.length; i++) {
					sb.append(Character.toUpperCase(words[i].charAt(0)));
					if (words[i].length() > 1)
						sb.append(words[i].substring(1));
				}
			}
			System.out.println(sb);

		}
	}
}