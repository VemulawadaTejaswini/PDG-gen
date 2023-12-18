import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		while(sc.hasNext()) {
			String s = sc.next();
			if(s.contains("apple")) {
				al.add(s.replace("apple", "peach"));
			} else if(s.contains("peach")) {
				al.add(s.replace("peach", "apple"));
			} else {
				al.add(s);
			}
		}
		System.out.print(al.get(0));
		for(int i = 1, n = al.size(); i < n; i++) {
			System.out.print(" " + al.get(i));
		}
		System.out.println();
	}
}