import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        long Sum = 1;
        
        for(long i=0; i<N; i++){
            long A = scanner.nextLong();
            Sum *= A;
        }
        
        if(Sum<Math.pow(10,18)){
            System.out.println(Sum);
        }else{
            System.out.println(-1);
        }

    }
}
