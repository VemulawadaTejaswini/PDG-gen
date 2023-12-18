import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	String input;
	HashSet<String> dic = new HashSet<String>();
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < n; i++) {
	    input = br.readLine();
	    if (input.startsWith("i")) {
		dic.add(input.substring(7));
	    } else if (input.startsWith("f")) {
		if (dic.contains(input.substring(5))) {
		    sb.append("yes\n");
		} else {
		    sb.append("no\n");
		}
	    }
	}
	System.out.print(sb);
    }
}