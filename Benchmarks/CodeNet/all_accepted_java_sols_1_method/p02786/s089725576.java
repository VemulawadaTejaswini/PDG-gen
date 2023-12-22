import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();

        long attacks = 0;
        long level = 1;
        while (h != 0) {
            h = h/2;
            attacks += level;
            level *= 2;
        }
        System.out.println(attacks);
    }
}