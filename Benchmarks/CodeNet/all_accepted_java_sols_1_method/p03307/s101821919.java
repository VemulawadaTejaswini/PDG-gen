import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N % 2 == 0) {
            System.out.println(N);
        } else {
            System.out.println(N * 2);
        }
    }
}
