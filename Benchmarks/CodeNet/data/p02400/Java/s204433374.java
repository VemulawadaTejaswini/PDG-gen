import java.lang.Math;
import java.util.Scanner;
import java.math.BigDecimal;
import java.lang.Double;

public class Main{
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);

String r = sc.next();//r

//String strr = Integer.toString();

BigDecimal br= new BigDecimal(r);


BigDecimal rr= br.multiply(br);
BigDecimal s = rr.multiply(BigDecimal.valueOf(Math.PI));

BigDecimal r2 = br.add(br);
BigDecimal c = r2.multiply(BigDecimal.valueOf(Math.PI));
System.out.println(s+" "+c);
  }


}
