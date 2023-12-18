import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for(int i=1;i<=m;i++) {
			String t = sc.next();
			TreeSet<String> pats = new TreeSet<>();
			for(int j=0;j<t.length()-1;j++) {
				String front = reverse(t.substring(0,j+1));
				String tail = reverse(t.substring(j+1));
				 pats.add(reverse(front) + tail);
                 pats.add(tail + reverse(front));
                 pats.add(reverse(tail) + front);
                 pats.add(front + reverse(tail));
                 pats.add(front + tail);
                 pats.add(tail + front);
                 pats.add(reverse(front) + reverse(tail));
                 pats.add(reverse(tail) + reverse(front));
			}
			System.out.println(pats.size());
		}
	}
}
