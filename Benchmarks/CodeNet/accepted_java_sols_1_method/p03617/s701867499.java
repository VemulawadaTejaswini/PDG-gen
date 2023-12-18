import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        long[] sl = {q*4,h*2,s};
        long[] dl = {q*8,h*4,s*2,d};
        Arrays.sort(sl);
        Arrays.sort(dl);
        System.out.println(n/2*dl[0] + n%2*sl[0]);
    }
}
