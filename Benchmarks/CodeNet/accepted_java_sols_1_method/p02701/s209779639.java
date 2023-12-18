import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Set<String> ss = new HashSet<String>();

		for ( int i=0; i<n; i++ ) {
			String s = sc.next();
			ss.add(s);
		}

		System.out.println(ss.size());

	}
}