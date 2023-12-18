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
//			bf = new BufferedReader(new InputStreamReader(System.in));
//			st = new StringTokenizer(bf.readLine());
			
			Scanner sc = new Scanner(System.in);
			while (sc.hasNextLine()) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				int e = sc.nextInt();
				int f = sc.nextInt();
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