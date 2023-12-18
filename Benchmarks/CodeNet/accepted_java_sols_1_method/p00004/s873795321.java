import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


class Main {
	public static void main(String[] args) throws IOException {
		DecimalFormat df1 = new DecimalFormat("0.000");
		Scanner in = new Scanner(System.in);
		ArrayList<String> SL = new ArrayList<String>();
		
		
		while((in.hasNext())){
			String li = in.nextLine();
			String[] ss = li.split(" ");
			double x1 = Double.parseDouble(ss[0]);
			double y1 = Double.parseDouble(ss[1]);
			double a1 = Double.parseDouble(ss[2]);
			double x2 = Double.parseDouble(ss[3]);
			double y2 = Double.parseDouble(ss[4]);
			double a2 = Double.parseDouble(ss[5]);
			double y3 = y1*x2 - y2*x1;
			double a3 = a1*x2 - a2*x1;
			double y = a3/y3;
			double x = (a1 - y1*y) / x1;
			System.out.println(df1.format(x) +" "+df1.format(y));
			}
		
		
	}

}