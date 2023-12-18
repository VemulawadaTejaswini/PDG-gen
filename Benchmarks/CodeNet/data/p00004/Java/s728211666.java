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
			
			for (int i=0;i<10;i++) {
			int a = nextInt();
			int b = nextInt();
			int c = nextInt();
			int d = nextInt();
			int e = nextInt();
			int f = nextInt();
			int det = a*e - b*d;
			double newx = (e*c+(-b)*f)/det;
			double newy = ((-d)*c+a*f)/det;
			
			DecimalFormat df = new DecimalFormat("#.000");
			System.out.println(df.format(newx)+" "+df.format(newy));
			}
			
			
//			int n = nextInt();
//			int[] a;
//			for (int i = 0;i < n ; i++) {
//				a = new int[3];
//				a[0] = nextInt();
//				a[1] = nextInt();
//				a[2] = nextInt();
//				Arrays.sort(a);
//				
////				for(int k: a)
////					System.out.println(k);
//					
//				if ((a[0]*a[0]+a[1]*a[1])==a[2]*a[2])
//					System.out.println("YES");
//				else
//					System.out.println("NO");
//			}
//			sc.close();
			
			
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