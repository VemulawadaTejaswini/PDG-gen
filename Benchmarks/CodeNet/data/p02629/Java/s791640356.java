import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            long show = n / 26;
            char v = (char) (n % 26 + 96);
            builder.insert(0, v);
            n /= 26;
        }
        System.out.println(builder);
    }
}