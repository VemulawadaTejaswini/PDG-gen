import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
            int N = sc.nextInt();
            int K = sc.nextInt();
            int result = 1;
      
            for (int i=1; i<=N-1; i++){
              result = result*(K-1); 
            }
      
            int C = K*result;
       
            if (N==1) {
                System.out.println(K);
            }
            
            else  {
                System.out.println(C);  
            }
    }
}