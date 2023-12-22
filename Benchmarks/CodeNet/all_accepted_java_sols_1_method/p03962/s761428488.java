import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		Set<Integer> ans = new HashSet<Integer>();
		ans.add(a);
		ans.add(b);
		ans.add(c);
		System.out.println(ans.size());
	}
}
