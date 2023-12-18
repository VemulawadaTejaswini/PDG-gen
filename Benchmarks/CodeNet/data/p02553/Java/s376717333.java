import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long ac = (long)(a * c);
        long ad = (long)(a * d);
        long bc = (long)(b * c);
        long bd = (long)(b * d);

        if (ac >= ad && ac >= bc && ac >= bd) System.out.println(ac);
        else if (ad >= ac && ad >= bc && ad >= bd) System.out.println(ad);
        else if (bc >= ac && bc >= ad && ad >= bd) System.out.println(bc);
        else System.out.println(bd);
    }
}