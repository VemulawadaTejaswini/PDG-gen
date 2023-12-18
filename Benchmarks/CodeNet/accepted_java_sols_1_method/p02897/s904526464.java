import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println(((N >> 1) + 1) / (double)N);
        }
    }
}
