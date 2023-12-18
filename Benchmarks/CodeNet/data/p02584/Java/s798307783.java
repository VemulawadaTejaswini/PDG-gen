import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	long x = sc.nextLong();
      	long k = sc.nextLong();
      	long d = sc.nextLong();
      	long m = x / d;
      
      	if( Math.abs(m) > k ){
          if( m > 0 ){
          	x = x - k*d;
          }else{
            x = x + k*d;
          }
          //System.out.println(x+":"+k+":"+m);
        }else{
          x = x - m*d;
          k = k - Math.abs(m);
          //System.out.println(x+":"+k+"::"+m);
          if( k%2 == 1 ){
            if( Math.abs(x+d) <= Math.abs(x-d) ){
              x += d;
            }else{
              x -= d;
            }
          }
          
        }
      System.out.println(x);
	}
}