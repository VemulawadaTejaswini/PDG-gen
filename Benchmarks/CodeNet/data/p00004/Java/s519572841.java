

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line ="";
		while((line = br.readLine())!=null){
			String[] s= line.split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int d = Integer.parseInt(s[3]);
			int e = Integer.parseInt(s[4]);
			int f = Integer.parseInt(s[5]);
			double x =(double) (e*c - b*f)/(a*e - b*d);
			double y =(double) (a*f - c*d)/(a*e - b*d);
			BigDecimal bdx = (new BigDecimal(x)).setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal bdy = (new BigDecimal(y)).setScale(3, BigDecimal.ROUND_HALF_UP);
			
			System.out.println(bdx.doubleValue()+" "+bdy.doubleValue());
		}

	}

}