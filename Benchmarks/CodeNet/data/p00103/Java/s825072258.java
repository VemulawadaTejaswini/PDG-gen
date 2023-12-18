import java.io.*;
import java.util.*;

public class Main {
	int[] base = new int[4];
	int out , ten;
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(in.readLine());
		for ( ; i > 0; i-- ) {
			for ( int n = 0; n < 4; n++ )
				m.base[n] = 0;
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
			for ( int i = 2; i >= 0; i-- ) {
				if ( base[i] != 0 ) {
					base[i+1] = base[i];
					base[i] = 0;
				}
			}
			base[0]++;
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
				base[n] = 0;
			}
			ten += count + 1;
			return;
		}		
	}
}