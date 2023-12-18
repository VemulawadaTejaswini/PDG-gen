import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        long k = cin.nextLong();
        if(k == 1){
        	System.out.println(0);
        	return;
        }
        HashMap<Long,Integer> mp = new HashMap<Long,Integer>();
        long x = n%k;
        long minn = x;
        while(true){
        	x = Math.abs(x-k);
        	if(!mp.containsKey(x)){
        		 mp.put(x, 1);
        		 minn = Math.min(x, minn);
        	}
        	else break;
        }
        System.out.println(minn);
    }
}