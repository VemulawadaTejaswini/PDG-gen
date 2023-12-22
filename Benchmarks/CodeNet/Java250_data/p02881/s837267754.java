import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(Answer(N));
    }
    
    public static long Answer(long x){
        
        int rx = (int) Math.sqrt(x);
        int A = 1;
        
        for(int i = rx; i >= 2; i--){
            if (x % i == 0){
                A = i;
                break;
            }
        }
        
        return A + (x / A) -2;
    }
}
