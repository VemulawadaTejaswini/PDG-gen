import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
 
 
public class Main{
	
	//@paste
	/*
	public static long mod_pow(long a, long e, long m){
	    if(e == 0){
	        return 1;
	    }else if(e % 2 == 0){
	        long ret = mod_pow(a, e / 2, m);
	        return (ret * ret) % m;
	    }else{
	        return (mod_pow(a, e - 1, m) * a) % m;
	    }
	}
	public static long mod_inv(long a, long p){
	    return mod_pow(a, p-2, p);
	}
	*/
	
	public static long mod_inv(long a, long m){
		//System.err.println(a + " : " + m);
	    return (a == 1 ? 1 : (1 - m*mod_inv(m%a, a)) / a + m);
	}
	
	
	//@paste
	public static long chinese_remainder(long[] as, long[] ms){
		long prod = 1;
		for(long m : ms){
			prod *= m;
		}
		
		long ret = 0;
		for(int i = 0; i < ms.length; i++){
			final long M = prod / ms[i];
			final long inv = mod_inv(M, ms[i]);
			
			long a = as[i] - as[i] / prod * prod;
			if(a < 0){
				a += prod;
			}
			
			ret = (ret + M * inv * as[i] % prod) % prod;
		}
		
		return ret;
	}
	
    public static void main(String[] args){
    	final Scanner sc = new Scanner(System.in);
    	
    	final int n = sc.nextInt();
    	
    	long[] as = new long[]{0, 0};
    	long[] ms = new long[]{1158991, 1386811};
    	
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
    				as[i] *= mod_inv((ms[i] + val) % ms[i], ms[i]);
    				as[i] %= ms[i];
    				break;
    			}
    		}
    	}
    	
    	//System.out.println(Arrays.toString(as));
    	long mul = 1;
    	for(long m : ms){
    		mul *= m;
    	}
    	
    	long ret =  chinese_remainder(as, ms);
    	while(ret < Integer.MIN_VALUE){
    		ret += mul;
    	}
    	while(ret > Integer.MAX_VALUE){
    		ret -= mul;
    	}
    	System.out.println(ret);
    	
    	sc.close();
    }
     
}