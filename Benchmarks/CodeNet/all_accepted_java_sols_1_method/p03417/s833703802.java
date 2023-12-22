import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long M = Long.parseLong(sc.next());
        long ans = 0;
        if(N <= 2 && M <= 2) {
            if(N == 1 && M == 1) ans = 1;
            else ans = 0; 
        }else if(N == 1) ans = M-2;
        else if(M == 1) ans = N-2;
        else if(N == 2 || M == 2) ans = 0;
        else ans = (N-2) * (M-2);
        System.out.println(ans);
    }
}
