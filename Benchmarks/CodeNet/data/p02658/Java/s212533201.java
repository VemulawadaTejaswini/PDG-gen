import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         
        int N = sc.nextInt();
      
      	long A = (long)(Math.pow(10, 18));
      
      	long C = 0L;
      
      	for (int i = 0; i < N; i++){
        	long B = sc.nextLong();
          	
          	if (i == 0){
              C = B; 
            } else {
              C *= B;
            }
          
        }
        
      	if (A < C){
			System.out.println(-1);
        } else {
            System.out.println(C);
        }

    }
}