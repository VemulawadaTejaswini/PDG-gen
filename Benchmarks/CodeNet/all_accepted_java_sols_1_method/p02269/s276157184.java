import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
static private Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	int n = s.nextInt();
	String w,d;
	Set<String> hash = new HashSet<String>();
	StringBuilder sb = new StringBuilder();

	for(int i = 0;i < n;i++) {
		w = s.next();
		d = s.next();
		if(w.equals("insert")) {
			hash.add(d);
		}else {
			if(hash.contains(d)) {
			sb.append("yes\n");
			}else {
			sb.append("no\n");
			}
		}
	}
	System.out.print(sb.toString());
}
}
