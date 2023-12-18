import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> h = new HashMap<String,String>();
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			h.put(sc.next(),sc.next());
		int m = sc.nextInt();
		for ( int i = 0; i < m; i++ ) {
			String p = sc.next();
			if ( h.containsKey(p) ) p = h.get(p);
			System.out.print(p);
		}
		System.out.println();
	}
}