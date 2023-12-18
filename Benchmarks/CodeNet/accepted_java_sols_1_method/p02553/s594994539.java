import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ac = a * c;
        long ad = a * d;
        long bc = b * c;
        long bd = b * d;
        long max = ac;
        if (max < ad) max = ad;
        if (max < bc) max = bc;
        if (max < bd) max = bd;
        System.out.print(max);
    }
}
