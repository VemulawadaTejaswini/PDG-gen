import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
	
	public static final long H = 4222412220567L;
	public static final long B = 143227L;
	
	//library
	public static long modmul(long a, long b, long m){
		long ans =  (((a * (b >> 20) % m) << 20) + a * (b & ((1 << 20) - 1))) % m;
		if(ans < 0){
			return ans + m;
		}else{
			return ans;
		}
	}
	
	public static long inv(long a, long p){
		return (a == 1 ? 1 : (1 - p*inv(p%a, a)) / a + p);
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int n = sc.nextInt();
    	final int m = sc.nextInt();
    	
    	String str = sc.next();
    	char[] input = str.toCharArray();
    	
    	HashSet<Long> set = new HashSet<Long>();
    	
    	Long[] pow = new Long[n];
    	pow[0] = 1L;
    	for(int i = 1; i < n; i++){
    		pow[i] = modmul(pow[i-1], B, H);
    	}
    	long inv = inv(B, H);
    	
    	//System.out.println((inv * B) % H);
    	
    	int l = 0, r = 0;
    	long hash = input[l];
    	
    	for(int i = 0; i < m; i++){
    		String in = sc.next();
    		
    		if("L++".equals(in)){
    			hash -= modmul(pow[r - l], input[l], H);
    			if(hash < 0){
    				hash += H;
    			}
    			hash %= H;
    			l++;
    		}else if("L--".equals(in)){
    			l--;
    			hash += modmul(pow[r - l], input[l], H);
    			if(hash < 0){
    				hash += H;
    			}
    			hash %= H;
    		}else if("R++".equals(in)){
    			r++;
    			hash = modmul(hash, B, H);
    			hash += input[r];
    			if(hash < 0){
    				hash += H;
    			}
    			hash %= H;
    		}else if("R--".equals(in)){
    			hash -= input[r];
    			if(hash < 0){
    				hash += H;
    			}
    			hash %= H;
    			
    			hash = modmul(hash, inv, H);
    			r--;
    		}
    		
    		if(!set.contains(hash)){
    			set.add(hash);
    			//System.out.println(str.substring(l, r + 1) + " : " + hash);
    		}else{
    			//System.out.println("dup :: " + str.substring(l, r + 1) + " : " + hash);
    		}
    	}
    	
    	System.out.println(set.size());
    	
    }
     
}