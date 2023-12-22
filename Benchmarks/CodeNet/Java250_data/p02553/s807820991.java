import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        long max = Long.MIN_VALUE;
        if(a - b != 0){
            if(a == 0) a += 1;
            if(b == 0) b -= 1;
        }
        if(c - d != 0){
            if(c == 0) c += 1;
            if(d == 0) d -= 1;
        }
        max = Math.max(max, a * c);
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        max = Math.max(max, b * d);
        System.out.println(max);
    }
}
