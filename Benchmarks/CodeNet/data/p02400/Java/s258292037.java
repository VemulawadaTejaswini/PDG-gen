import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws IOException {
		DecimalFormat df1 = new DecimalFormat("0.000000");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		String[] ss = s.split(" ");
		double a = Double.parseDouble(ss[0]);
		System.out.print(df1.format((double)a*(double)a*Math.PI)+ " ");
		System.out.println(df1.format(2*(double)a*Math.PI));
	}

}