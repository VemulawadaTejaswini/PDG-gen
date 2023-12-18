import java.io.*;
import java.util.*;

public class Main {
	int[] base = new int[4];
	int out , ten;
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		for ( int i = 0; i < 4; i++ )
			m.base[i] = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(in.readLine());
		for ( ; i > 0; i-- ) {
			m.out = 0; m.ten = 0;
			while ( m.out < 3 ) {
				String eve = in.readLine();
				m.check(eve);
			}
			System.out.println(m.ten);
		}
	}
	public void check( String str ) {
		if ( str.equals("OUT") ) {
			out++; return;
		}
		else if ( str.equals("HIT") ) {
			base[0]++;
			for ( int n = 0; n < 3; n++ ) {
				base[n+1] = base[n];
				base[n] = 0;
			}
			if ( base[3] != 0 ) {
				ten++;
				base[3] = 0;
			}
			return;
		}
		else if ( str.equals("HOMERUN") ) {
			int count = 0;
			for ( int n = 0; n < 4; n++ ) {
				if ( base[n] != 0 ) count++;
			}
			ten += count;
			return;
		}		
	}
}