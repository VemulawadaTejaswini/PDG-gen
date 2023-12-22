import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
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
			
			double m = 100000;
			int n = nextInt();
			for (int i=1;i<=n;i++) {
				m = m * 1.05;
				BigDecimal bd = new BigDecimal(m);
				BigDecimal bd3 = bd.setScale(-3, BigDecimal.ROUND_UP);
				
				m = bd3.intValue();
//				System.out.println((int)m);
			}
			DecimalFormat df = new DecimalFormat("0");
			System.out.println(df.format(m));
			
		} catch (Exception e) {
			System.out.println("dacat");
			e.printStackTrace();
		}
	}
	
	private int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	
	private String next() throws IOException {
		try {
		if (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(bf.readLine());
		} catch (Exception e) {
			System.out.println("dacat");
		}
		return st.nextToken();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
	}

}