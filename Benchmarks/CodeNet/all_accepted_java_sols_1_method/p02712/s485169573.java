import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        long n = sn.nextLong();
        long sum = 0;
        
        for(long i = 1; i <= n; i++) {
            if((i % 3) == 0 || (i % 5) == 0 || (i % 15) == 0) {
            } else {
                sum += i;
            }
        }
        
        System.out.print(sum);
    }
}
