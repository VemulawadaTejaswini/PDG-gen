import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            long e = (n - 1) % 26;
            char v = (char) (e + 97);
            builder.insert(0, v);
            if (e == 25) {
                n--;
            }
            n /= 26;
        }
        System.out.println(builder);
    }
}