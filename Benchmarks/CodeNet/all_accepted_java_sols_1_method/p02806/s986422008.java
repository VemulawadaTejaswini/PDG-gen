import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		String s = "";
		int t = 0;
		for(i=0;i<n;i++) {
			s = sc.next();
			t = parseInt(sc.next());
			map.put(s, t);
			list.add(s);
		}
		String x = sc.next();
		sc.close();
		int sum=0;
		for (i = list.indexOf(x)+1; i < list.size(); i++) {
			sum += map.get(list.get(i));
		}
		out.println(sum);
	}
}
