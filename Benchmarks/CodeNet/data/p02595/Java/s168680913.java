import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), d = sc.nextLong(), count  = 0;
        while (n-->0){
            long a = sc.nextLong(), b = sc.nextLong();
            if((float)Math.sqrt(Math.abs(a*a)+Math.abs(b*b)) <= d){
                count++;
            }
        }
        System.out.println(count);
    }
}