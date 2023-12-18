import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	private StringTokenizer st;
	private BufferedReader bf;
	private int w;
	
	Main() {
		readData();
		

	}
	

	private void readData() {
		try {
			bf = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(bf.readLine());
			
			while (true) {
				int m = nextInt();
				if (m==0)
					break;
				boolean[] r = new boolean[256];
	//			boolean[] dirty = new boolean[256];
				char[] table = new char[256];
				String[] s = new String[m];
				for (int i=0;i<m;i++) {
					char a = next().charAt(0);
					char b = next().charAt(0);
	//				System.out.println(a);
	//				System.out.println(b);
					table[a] = b;
					r[a] = true;
				}
	//			for (int i=0;i<256;i++) {
	//				System.out.print(ca[i]);
	//			}
				
				int n = nextInt();
				String tmp,result;
				result = "";
				for (int i=0;i<n;i++) {
					tmp = next();
					char c = tmp.charAt(0);
					if (r[c]) {
						result += Character.toString(table[c]);
						r[c] = false;
					} else {
						result += tmp;
					}
				}
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	
	private String next() throws IOException {
		if (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(bf.readLine());
		return st.nextToken();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
	}

}