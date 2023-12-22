import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] march = new long[5];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.startsWith("M")) {
                march[0]++;
            } else if (s.startsWith("A")) {
                march[1]++;
            } else if (s.startsWith("R")) {
                march[2]++;
            } else if (s.startsWith("C")) {
                march[3]++;
            } else if (s.startsWith("H")) {
                march[4]++;
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += march[i] * march[j] * march[k];
                }
            }
        }
        System.out.println(ans);
    }
}