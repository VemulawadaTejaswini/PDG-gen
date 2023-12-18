
import java.util.*;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        if(A + B == 0){
            System.out.println(0);
        }
        long sum = N / (A + B) * A + Math.min(N % (A + B), A);
        System.out.println(sum);
    }
}
