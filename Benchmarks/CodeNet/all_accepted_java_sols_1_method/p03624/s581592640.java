import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[]c = sc.next().toCharArray();
		Set<Character>charset =new TreeSet<Character>();
		char[]alp = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int i = 0; i < c.length; i++) {
			charset.add(c[i]);
		}
		if (charset.size() ==alp.length) {
			System.out.println("None");
		}else {
			for (int i = 0; i < alp.length; i++) {
				if (!charset.contains(alp[i])) {
					System.out.println(alp[i]);
					break;
				}
			}
		}
	}
}


