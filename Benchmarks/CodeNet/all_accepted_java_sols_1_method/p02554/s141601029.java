import java.util.*;
    public class Main{
    	public static void main(String[] args){
        	Scanner s  = new Scanner(System.in);
          	long a = s.nextInt();
          	long mod = (long)1e9 + 7;
    		long total = 10;
          	long totalwithout = 8;
          long totalw = 9;
          	for(int i = 0;i<a-1;i++) {
              total = (total*10)%mod;
          	totalwithout = (totalwithout*8)%mod;
              totalw = (totalw*9)%mod;
            }
          long ans1 = (2*totalw - totalwithout + mod)%mod;
          long ans  = (total - ans1 + mod)%mod;
          	System.out.println(ans);	
           }
    }