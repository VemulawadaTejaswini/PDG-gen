import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String str = br.readLine();
	while(str!=null){
	    String[] s =str.split(" ");
	    int a = Integer.parseInt(s[0]);
	    int b = Integer.parseInt(s[1]);
	    int c = Integer.parseInt(s[2]);
	    int d = Integer.parseInt(s[3]);
	    int e = Integer.parseInt(s[4]);
	    int f = Integer.parseInt(s[5]);
	    BigDecimal x =new BigDecimal((double) (c*e-b*f)/(a*e-b*d));
	    BigDecimal y = new BigDecimal((double)(a*f-c*d)/(a*e-b*d));
	    x=x.setScale(3,BigDecimal.ROUND_HALF_UP);
	    y=y.setScale(3,BigDecimal.ROUND_HALF_UP);
	      System.out.println(x+" "+y);
	    str = br.readLine();
	}
    }
}