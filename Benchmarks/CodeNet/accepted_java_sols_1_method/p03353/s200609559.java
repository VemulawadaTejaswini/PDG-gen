import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		Set<String> set = new TreeSet<>();
		for(int i = 0 ; i < s.length() ; i++) {
			for(int j = i + 1 ; j < s.length() + 1 ; j++) {
				if(j - i <= 5) set.add(s.substring(i, j));
			}
		}
		int i = 0;
		for(String x : set) {
			i++;
			if(i == k) {
				System.out.println(x);
				return;
			}
		}
	}
}
