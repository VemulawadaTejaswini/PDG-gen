import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Double> x_list = new ArrayList<Double>();
		ArrayList<Double> y_list = new ArrayList<Double>();
		
		while (true) {
			
			String s = br.readLine();
			if(s == null) break;
			StringTokenizer st = new StringTokenizer(s," ");
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			double d = Double.parseDouble(st.nextToken());
			double e = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double x = (c * e - b * f) / (a * e - b * d);
			double y = (f * a - c * d) / (a * e - d * b);
			x_list.add(x);
			y_list.add(y);
		}
		for (int i = 0; i < x_list.size(); i++) {
			System.out.printf("%.3f %.3f", x_list.get(i), y_list.get(i));
			System.out.println();
		}
	}
	
}