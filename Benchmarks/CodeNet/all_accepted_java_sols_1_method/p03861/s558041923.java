import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();
        long r = b/x - a/x;
        if(a%x == 0)r++;
        System.out.println(r);
    }
}
