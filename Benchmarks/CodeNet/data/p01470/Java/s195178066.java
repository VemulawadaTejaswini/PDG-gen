import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
 
 
public class Main{
	
	//@paste
	public static long mod_inv(long a, long m){
	    return (a == 1 ? 1 : (1 - m*mod_inv(m%a, a)) / a + m);
	}
	
	//@paste
	public static long chinese_remainder(long[] as, long[] ms){
		long mul = 1;
		for(long m : ms){
			mul *= m;
		}
		
		long ret = 0;
		for(int i = 0; i < ms.length; i++){
			final long m = mul / ms[i];
			final long inv = mod_inv(m, ms[i]);
			
			long a = as[i] - as[i] / mul * mul;
			if(a < 0){
				a += mul;
			}
			
			ret = (ret + m * inv * as[i] % mul) % mul;
		}
		
		return ret;
	}
	
    public static void main(String[] args){
    	final Scanner sc = new Scanner(System.in);
    	
    	final int n = sc.nextInt();
    	
    	long[] as = new long[]{0, 0};
    	long[] ms = new long[]{770813, 386839};
    	
    	for(int tt = 0; tt < n; tt++){
    		final int ops = sc.nextInt();
    		final long val = sc.nextLong();
    		
    		for(int i = 0; i < as.length; i++){
    			switch(ops){
    			case 1: // +
    				as[i] += val;
    				as[i] %= ms[i];
    				break;
    			case 2: // -
    				as[i] += ms[i];
    				as[i] -= val;
    				as[i] %= ms[i];
    				break;
    			case 3: // *
    				as[i] *= val;
    				as[i] %= ms[i];
    				break;
    			case 4: // /
    				as[i] *= mod_inv(ms[i] + val, ms[i]);
    				as[i] %= ms[i];
    				break;
    			}
    		}
    	}
    	
    	//System.out.println(Arrays.toString(as));
    	
    	long ret =  chinese_remainder(as, ms);
    	while(ret < Integer.MIN_VALUE){
    		ret += (ms[0] * ms[1]);
    	}
    	while(ret > Integer.MAX_VALUE){
    		ret -= (ms[0] * ms[1]);
    	}
    	System.out.println(ret);
    	
    	sc.close();
    }
     
}