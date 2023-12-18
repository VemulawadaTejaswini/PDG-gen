import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {

	public static void main(String[] args) {
		Set<Long> set = new TreeSet<Long>();
		Set<Long> ans = new TreeSet<Long>();
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				Long l = sc.nextLong();
				boolean check = set.add(l);
				if (!check) ans.add(l);  //重複した場合ansに追加
			}
			times = sc.nextInt();
			for (int i=0; i<times; i++) {
				Long l = sc.nextLong();
				boolean check = set.add(l);
				if (!check) ans.add(l);  //重複した場合ansに追加
			}
			ArrayList<Long>  a = new ArrayList<Long>(ans);
			for (int i=0; i<a.size(); i++) System.out.println(a.get(i));
		}
	}
}
