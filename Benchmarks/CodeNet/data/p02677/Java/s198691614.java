//--- pC ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	private void run_case() {
		double a = Double.parseDouble(reader.ns());
		double b = Double.parseDouble(reader.ns());
		double h = Double.parseDouble(reader.ns());
		double m = Double.parseDouble(reader.ns());

		double angle = calcAngle(h, m);
		double c = a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angle));

		c = Math.sqrt(c);
		
		out.println(c);

		return;
	}

	private double calcAngle(double h, double m) {
        double hour_angle = (0.5 * (h*60 + m));
        double minute_angle = (6*m);
        double angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360-angle, angle);
        return angle;
    }
}


class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
