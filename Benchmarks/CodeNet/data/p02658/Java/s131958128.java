import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner inp = new Scanner(System.in);
        long ans = 1;
        final long MAX_V = 1000000000000000000L;
        int n = inp.nextInt();
        long num= 0;
        
        while(n-- > 0) {
            num = inp.nextLong();
            if(num == 0) {
                ans = 0;
                break;
            } else {
                ans *= num;
                if(ans > MAX_V) {
                    ans = -1;
                    break;
                }
            }
        }
    
        if(ans > MAX_V) {
            ans = -1;
        }
        System.out.println(ans);
        inp.close();
    }
}