import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long amt = 100;
        long y = 0;
        while (amt < x) {
            amt += (amt/100);
            y++;
        }

        System.out.println(y);
    }
}