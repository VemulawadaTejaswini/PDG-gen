import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] p = new int[N];
       
       
       for (int i = 0;i<N;i++) {
            p[i] = sc.nextInt();
       }
       
       int count = 0; 
       int pj = p[0]; 
       
       for(int i = 0; i < N; i++) {
             if(p[i]<=pj) {
               ++count;
               pj = p[i]; 
           }
       }
       
       System.out.println(count);
    
        
    }
    
}