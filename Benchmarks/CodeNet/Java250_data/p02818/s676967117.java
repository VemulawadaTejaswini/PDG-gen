import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a string
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (c > a) {
            c -= a;
            a = 0;
            b = b > c ? b - c : 0;
        } else {
            a -= c;
        }
        // output
        System.out.printf("%d %d%n",a, b);
    }
}