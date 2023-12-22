import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		Set<String> Dic = new HashSet<String>();
		
		int n = sc.nextInt();
		String order;
		String str;
		
		for(int i=0; i<n; i++) {
			order = sc.next();
			str = sc.next();
			if( order.equals("insert") ) { Dic.add(str); }
			else {
				if( Dic.contains(str) ) { output.append("yes\n"); }
				else { output.append("no\n"); }
			}
		}
		System.out.print(output);
	}
}

