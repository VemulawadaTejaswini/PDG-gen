import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
     public static void main(String[] args){
     	
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long n = Long.parseLong(br.readLine());
            
        	System.out.print(n + ":");
        	primeFact(n);
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
	
	static void primeFact (long n) {
		
		for (long sqrtRel = 2; sqrtRel*sqrtRel <= n;) {
			if (n%sqrtRel == 0) {
			System.out.print(" " + sqrtRel);
				n = n/sqrtRel;
			} else {
				sqrtRel++;
			}
		}
		
		System.out.println(" " + n);
	}
}