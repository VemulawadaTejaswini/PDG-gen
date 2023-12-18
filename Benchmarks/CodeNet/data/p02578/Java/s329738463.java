import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long count = 0;
        int now = sc.nextInt();
        for (int i = 0; i < N-1; i++) {
            int Ai = sc.nextInt();
            if (now < Ai) {
                count += (Ai-now);
            }
            now = Ai;
        }
        System.out.println(count);
    }
}