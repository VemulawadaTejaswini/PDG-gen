import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        int x = 0;
        long n = N;
        while(n > 0) {
            x += n % 10;
            n /= 10;
        }
        if(N % x == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
