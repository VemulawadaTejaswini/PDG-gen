import java.io.*;
import java.math.*;
public class Main{
	public static void main(String args[]){
    double r,ans1,ans2;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String line = reader.readLine();
        r = Double.parseDouble(line);
		}catch(Exception e){
      r = 0;
    }
    ans1 = r * r * Math.PI;
    BigDecimal x = new BigDecimal(ans1);
    x = x.setScale(6, RoundingMode.HALF_UP);
    ans2 = 2 * r * Math.PI;
    BigDecimal y = new BigDecimal(ans2);
    y = y.setScale(6, RoundingMode.HALF_UP);
		System.out.println(x + " " + y);
	}
}
