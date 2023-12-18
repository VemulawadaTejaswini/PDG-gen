import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        long Sum = 1;
        boolean hantei = false;
        
        for(long i=0; i<N; i++){
            long A = scanner.nextLong();
            Sum *= A;
            
            if(Sum>1000000000000000000L){
                System.out.println(-1);
                break;
            }
        }
        
        if(Sum<=1000000000000000000L){
            System.out.println(Sum);
        }

    }
}
