import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> dictionary = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    String type = sc.next();
		    String name = sc.next();
		    if (type.equals("insert")) {
		        dictionary.add(name);
		    } else {
		        if (dictionary.contains(name)) {
		            sb.append("yes");
		        } else {
		            sb.append("no");
		        }
		        sb.append("\n");
		    }
		}
		System.out.print(sb);
	}
 }

