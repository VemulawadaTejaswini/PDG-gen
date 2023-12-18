import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        long count = 1;
        long num = x;
        while (num < y) {
            num = num * 2;
            if (num > y) break;
            else count++;
        }
        System.out.println(count);
    }
}
