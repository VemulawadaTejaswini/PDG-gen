import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        long N =sc.nextLong();
        long K =sc.nextLong();
        
        long answer = K;
        for (int i=1;i<N;i++){
            if (N==1){
                break;
            }else{
                
                answer *= K - 1;
            
            
            }
        }
         
    System.out.println(answer);
        
        
        
        
        
        
    }
}
