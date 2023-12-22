import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int res10000 = -1;
        int res5000 = -1;
        int res1000 = -1;

        for (int a = 0; a <= N; a++ ) {
            for (int b = 0; b + a <= N; b++) {
                int c = N - a - b;
                int total = 10000 * a + 5000 * b + 1000 * c;
                if (total == Y) {
                    res10000 = a;
                    res5000 = b;
                    res1000 = c;
                }
            }
        }
        
        System.out.println(res10000 + " " + res5000 + " " + res1000);
    }
}