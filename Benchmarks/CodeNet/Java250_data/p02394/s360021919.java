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
	private int w,h,x,y,r;
	
	Main() {
		readData();
		
		
		if (isRange())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	private boolean isRange() {
		
		if (((r <= x) && (x <= w-r)) && ((r <= y) && (y <= h-r)))
			return true;
		
		return false;
	}
	
	private void readData() {
		try {
			bf = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(bf.readLine());
			w = nextInt();
			h = nextInt();
			x = nextInt();
			y = nextInt();
			r = nextInt();
			
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