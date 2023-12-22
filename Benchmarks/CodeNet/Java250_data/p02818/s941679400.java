import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String K = sc.next();

        long longA = Long.parseLong(A);
        long longB = Long.parseLong(B);
        long longK = Long.parseLong(K);

        if (longK >= longA) {
            longK = longK - longA;
            longA = 0;
        } else {
            longA = longA - longK;
            longK = 0;
        }

        if (longK >= longB) {
            longK = longK - longB;
            longB = 0;
        } else {
            longB = longB - longK;
            longK = 0;
        }

        System.out.println(longA + " " + longB);
    }
}
