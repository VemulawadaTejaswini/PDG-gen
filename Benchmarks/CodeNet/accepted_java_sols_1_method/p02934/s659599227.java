
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
        
        double inv = 0;
        for(int i=0;i<n;i++) {
        	inv += 1/A[i];
        }
        
        inv = 1/inv;
        
        System.out.println(numberFormat.format(inv));
        		
    }
            
        


    
    
   
}
