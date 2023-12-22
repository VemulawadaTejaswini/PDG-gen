import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();

        long val = 100;
        long years = 0;
        while (val < X) {
            val = val + (val / 100);
            years++;
        }
        System.out.println(years);
    }
}
