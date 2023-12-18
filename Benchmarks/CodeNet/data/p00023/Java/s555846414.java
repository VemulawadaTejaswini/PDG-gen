import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.parseInt(br.readLine());
	    for (int i=0;i<n;i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		double x[] = new double[2];
		double y[] = new double[2];
		double r[] = new double[2];
		for (int j=0;j<2;j++) {
		    x[j] = Double.parseDouble(st.nextToken());
		    y[j] = Double.parseDouble(st.nextToken());
		    r[j] = Double.parseDouble(st.nextToken());
		}
		double rsum = r[0]+r[1];
		double rdif = Math.abs(r[0]-r[1]);
		double d = Math.sqrt(Math.pow(x[1]-x[0],2)+Math.pow(y[1]-y[0],2));

		int check;
		if (rsum<d) check = 0;
		else if (rdif<=d && rsum>=d) check = 1;
		else if (r[0]>r[1]) check = 2;
		else check = -2;
		System.out.println(check);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    } 
}