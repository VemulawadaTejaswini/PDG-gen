import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long t = Long.parseLong(sc.next());
        
        if(x <= t) System.out.println(0);
        else System.out.println(x-t);
    }
}
