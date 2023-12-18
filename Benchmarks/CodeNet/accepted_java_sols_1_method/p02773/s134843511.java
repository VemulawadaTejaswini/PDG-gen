import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		String[] s = new String[n];
		for (i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		HashMap<String, Integer> map = new HashMap<>();
		for (i = 0; i < n; i++) {
			if(map.get(s[i])==null) {
				map.put(s[i], 1);
			} else {
				map.put(s[i], map.get(s[i])+1);
			}
		}
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		list.sort((e1,e2)->e1.getValue()==e2.getValue()?e1.getKey().compareTo(e2.getKey()):e2.getValue()-e1.getValue());
		int mx = list.get(0).getValue();
		PrintWriter pw = new PrintWriter(out);
		for (Entry<String, Integer> entry : list) {
			if(entry.getValue() != mx) break;
			pw.println(entry.getKey());
		}
		pw.flush();
	}
}
