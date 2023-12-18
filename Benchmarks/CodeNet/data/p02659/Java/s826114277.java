import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        double b = scan.nextDouble();
        long longb = (long)(b * 100);
        
        long ans = a * longb;
        ans = ans / 100l;

        System.out.println(ans);
    }
}