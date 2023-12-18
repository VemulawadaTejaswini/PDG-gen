import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	private StringTokenizer st;
	private BufferedReader bf;
	private int n;
	private int m;
	private int k;
	
	Main() {
		readData();
		
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(n);
		a.add(m);
		a.add(k);
		Collections.sort(a);
		
		String s = "";
		for (int i = 0;i < 2; i++) {
			s += a.get(i) + " ";
		}
		s += a.get(2);
		
		System.out.println(s);
	}
	
	private void readData() {
		try {
			bf = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(bf.readLine());
			n = nextInt();
			m = nextInt();
			k = nextInt();
			
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