import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

    public static void main (String args[]) {
        
		double x,y = 0.000;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				
				if (str.length == 6) {
					double a = Double.parseDouble(str[0]);
					double b = Double.parseDouble(str[1]);
					double c = Double.parseDouble(str[2]);
					double d = Double.parseDouble(str[3]);
					double e = Double.parseDouble(str[4]);
					double f = Double.parseDouble(str[5]);
										
					x = (b*f - c*e)/(b*d - a*e);
					y = (c*d - a*f)/(b*d - a*e);
					
					BigDecimal bx = new BigDecimal(String.valueOf(x));
					BigDecimal by = new BigDecimal(String.valueOf(y));
					
					double bx3 = bx.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
					double by3 = by.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
					
					System.out.println(bx3 + " " + by3);
					
				}else {
					System.exit(0);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		finally {
			System.exit(0);
		}
    }
}