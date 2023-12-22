import java.util.*;
import java.math.BigInteger;
 
public class Main{
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x, y, p=0;
    BigInteger p1 = BigInteger.valueOf(d);
    p1 = p1.multiply(p1);
    for(int i = 0; i < n ; i++){
    	x = sc.nextInt();
      	y = sc.nextInt();
      	BigInteger r = BigInteger.valueOf(x);
      	r = r.multiply(r);
      	BigInteger s = BigInteger.valueOf(y);
      	s = s.multiply(s);
      	r = r.add(s);
      	if(r.compareTo(p1) <= 0)
        	p++;
    }
    System.out.println(p);
  }
}