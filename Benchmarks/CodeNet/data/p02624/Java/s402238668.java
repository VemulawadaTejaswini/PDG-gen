import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long sum = 0;
        for(long x=1; x<=n; x++) {
            long y = n / x;
            sum += x*y*(y+1)/2;
        }
        System.out.println(sum);
    }
}