import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner inp = new Scanner(System.in);
        long a = inp.nextLong();
        double b = inp.nextDouble();
        long ans = (long)((double)a*b);
        System.out.println(ans);
        inp.close();
    }
}