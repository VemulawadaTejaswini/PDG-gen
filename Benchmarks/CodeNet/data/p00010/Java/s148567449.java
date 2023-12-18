import java.io.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)calc(in.readLine());
	}
	private static void calc(String arr){
		String[] points = arr.split(" ", 0);
		double x1 = Double.parseDouble(points[0]);
		double y1 = Double.parseDouble(points[1]);
		double x2 = Double.parseDouble(points[2]);
		double y2 = Double.parseDouble(points[3]);
		double x3 = Double.parseDouble(points[4]);
		double y3 = Double.parseDouble(points[5]);
		double A1 = 2*(x2-x1);
		double B1 = 2*(y2-y1);
		double C1 = pow(x1,2)-pow(x2,2)+pow(y1,2)-pow(y2,2);
		double A2 = 2*(x3-x1);
		double B2 = 2*(y3-y1);
		double C2 = pow(x1,2)-pow(x3,2)+pow(y1,2)-pow(y3,2);
		double x = (B1*C2-B2*C1)/(A1*B2-A2*B1);
		double y = (C1*A2-C2*A1)/(A1*B2-A2*B1);
		double r = sqrt(pow(x-x1,2)+pow(y-y1,2));
		System.out.printf("%.3f %.3f %.3f", x,y,r);
	}
}