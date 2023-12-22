import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  Pattern pt = Pattern.compile("th(?:is|e|at)");
  char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
  char[] bcd = "zabcdefghijklmnopqrstuvwxy".toCharArray();
  Map<Character, Character> caesarCipher = new TreeMap<Character, Character>();
  for (int i = 0; i < abc.length; i++) {
	caesarCipher.put(abc[i], bcd[i]);
  }
  Matcher mt;
  while (in.hasNext()) {
	final String q = in.nextLine();
	String result = q;
	mt = pt.matcher(result);
	StringBuilder sb = new StringBuilder(q.length());
	while (!mt.find()) {
	  for (int i = 0; i < result.length(); i++) {
		char charAt = result.charAt(i);
		if (caesarCipher.containsKey(charAt)) {
		  sb.append(caesarCipher.get(charAt));
		} else {
		  sb.append(charAt);
		}
	  }
	  result = sb.toString();
	  mt.reset(result);
	  sb.delete(0, sb.length());
	}
	System.out.println(result);
  }
}
}