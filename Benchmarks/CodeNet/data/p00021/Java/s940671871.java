import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	try {
	    int n = Integer.parseInt(br.readLine());
	    for (int i=0;i<n;i++) {
		Double x[] = new Double[4];
		Double y[] = new Double[4];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int j=0;j<4;j++) {
		    x[j] = Double.parseDouble(st.nextToken());
		    y[j] = Double.parseDouble(st.nextToken());
		}
		Double d1 = new Double(delta(x[0],y[0],x[1],y[1]));
		Double d2 = new Double(delta(x[2],y[2],x[3],y[3]));
		if (d1.compareTo(d2)==0) System.out.println("YES");
		else System.out.println("NO");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static double delta(Double px1,Double py1,Double px2,Double py2) {
	if (px1.compareTo(px2)==0) return Double.MAX_VALUE;
        else return (py2-py1)/(px2-px1);
    }
}