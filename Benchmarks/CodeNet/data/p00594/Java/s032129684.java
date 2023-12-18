import java.io.*;
import java.util.*;
 
public class p1008yet {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        //BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
        try {
            int A_size;
            
            while(true){
                /* input from here */
                A_size = s.nextInt();
                long[] A = new long[A_size];
                if(A_size==0){
                    break;
                } else if(A_size==1){
                    System.out.println(s.nextInt());
                    continue;
                } else {               
                    for(int i=0;i<A_size;i++){
                        A[i] = s.nextInt();
                    }
                }
                /* input till here */
                /* processing from here */
                Arrays.sort(A);
                 
                /* processing till here */
                /* output */
                 
                boolean nosol = true;
                int count = 1;
                for(int i=0;i<A_size-1;i++){
                    if(A[i]==A[i+1]){
                        count++;
                        if(count>A_size/2){
                            System.out.println(A[i]);
                            nosol = false;
                            break;
                        }
                    } else {
                        count = 1;
                        if(i>A_size/2){
                            break;
                        }
                    }                  
                }
                if(nosol){
                    System.out.println("NO COLOR");
                }      
                 
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	s.close();
        }
    }
}