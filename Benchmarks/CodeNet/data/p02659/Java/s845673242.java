import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        int b = (int) (scan.nextDouble() * 100);
        
        long ans = a * b;
        ans = ans / 100l;

        System.out.println(ans);
    }
}
