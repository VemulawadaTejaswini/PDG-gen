import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();
        String ans = "NO";
        if(a < b){
            long oni = v * t + a;
        	long nige = w * t + b;
        	if(oni >= nige){
            	ans = "YES";
            }
        }else{
            long oni = a - v * t;
        	long nige = b - w * t;
        	if(oni <= nige){
            	ans = "YES";
            }
        }
        System.out.println(ans);
    }
} 