import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		String s = sc.next();
		int K = sc.nextInt();
		List<String> list = new ArrayList<String>();
		for (int i=0;i<s.length();i++) {
			for (int j=0;j+i<s.length()&&j<K;j++) {
				if (!set.contains(s.substring(i, i+j+1))) {
					set.add(s.substring(i, i+j+1));
					list.add(s.substring(i, i+j+1));
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.get(K-1));
	}
}