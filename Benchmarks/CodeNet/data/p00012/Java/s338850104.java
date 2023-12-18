import java.io.*;
import java.util.StringTokenizer;
 
class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				double x[] = new double[4];
				double y[] = new double[4];
				for (int i=0;i<4;i++) {
					x[i] = Double.parseDouble(st.nextToken());
					y[i] = Double.parseDouble(st.nextToken());
				}
				double S1 = (x[1]-x[0])*(y[3]-y[0])-(x[3]-x[0])*(y[1]-y[0]);
				double S2 = (x[2]-x[0])*(y[3]-y[0])-(x[3]-x[0])*(y[2]-y[0]);
				if (check(S1,S2)) {
					S1 = (x[2]-x[1])*(y[3]-y[1])-(x[3]-x[1])*(y[2]-y[1]);
					S2 = (x[0]-x[1])*(y[3]-y[1])-(x[3]-x[1])*(y[0]-y[1]);
					if (check(S1,S2)) System.out.println("YES");
					else System.out.println("NO");
				}
				else System.out.println("NO");
			}
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}

	public static boolean check(double a,double b) {
		if (a>0&&b<0) return true;
		else if (a<0&&b>0) return true;
		return false;
	}
}