import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			
			
			String s = next();
			for (int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println("");
			
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