import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        
        long a = N % K;
        long b = -(N % K - K);
        
        if(a < b) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
