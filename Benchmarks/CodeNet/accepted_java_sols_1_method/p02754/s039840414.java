import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        long cnt = (long)Math.floor(N/(A+B));
        System.out.println(cnt*A + Math.min(N-cnt*(A+B), A));
    }

}
