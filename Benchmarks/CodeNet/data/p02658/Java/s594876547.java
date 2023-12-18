import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         
        int N = sc.nextInt();
      
      	long A = (long)(Math.pow(10, 18));
      
      	long[] B = new long[N];
      
      	boolean chk_0 = false;
      
      	for (int i = 0; i < N; i++){
          B[i] = sc.nextLong();
          if ( B[i] == 0){
            chk_0 = true;
          }
        }
      
     	long C = 0L;
      	boolean chk = true;
        if (!chk_0){  
          	C = B[0];
      		for (int i = 1; i < B.length; i++){  
          		try {
                  C = Math.multiplyExact(C, B[i]);
                } catch (ArithmeticException e) {
                  chk = false;
                  break;
                }
            }
        }

      	if (!chk || A < C){
			System.out.println(-1);
        } else {
            System.out.println(C);
        }

    }
}