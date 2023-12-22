import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();

        int len = 0;
        long cur = x;
        while (cur <= y) {
            len++;
            cur = cur * 2;
        }

        System.out.println(len);
    }
}