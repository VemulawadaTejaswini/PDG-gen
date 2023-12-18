import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long[]A = new long[N+M];
       

        for(int i=0; i<N+M; i++){
            A[i] = sc.nextInt();       
        }
        Arrays.sort(A);
 
        long all = 0;
        long cou = 0;
        for(int i=0; i<N+M; i++){   
            if(all+A[i]<=K){  
                all += A[i];
                    cou++;
        } 
    }        
	System.out.println(cou);
      }
}
