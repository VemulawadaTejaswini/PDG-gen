import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long D = s.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            long x = Math.abs(s.nextInt());
            long y = Math.abs(s.nextInt());
            if (x * x + y * y <= D * D) count++;
        }
        System.out.println(count);
    }
}