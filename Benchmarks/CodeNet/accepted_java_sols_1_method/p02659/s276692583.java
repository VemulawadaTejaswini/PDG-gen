import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        String bs = in.next();

        long b100 = Long.valueOf(bs.split("\\.")[0]) * 100 +
            Long.valueOf(bs.split("\\.")[1]);
        a *= b100;
        System.out.println(a / 100);
    }
}