
import java.util.*;
import java.text.DecimalFormat;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        
        DecimalFormat numberFormat = new DecimalFormat("0.00000");
        int n = in.nextInt();
        float[] A = new float[n];
        for(int i=0;i<n;i++) {
        	A[i] = in.nextFloat();
        }
        Arrays.sort(A);
        double ans = (A[0]+A[1])/2;
        if(n==2) {
        	System.out.println(numberFormat.format(ans));
        	return;
        }
        for(int i=2;i<n;i++) {
        	ans  = (ans+A[i])/2;
        }
        
        
        
        System.out.println(numberFormat.format(ans));
        		
    }
            
        


    
    
   
}
