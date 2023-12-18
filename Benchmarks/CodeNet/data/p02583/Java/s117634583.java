import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] line = new long[n];
        for (int i = 0; i < n; i++) {
            line[i] = sc.nextLong();
        }
        if (n < 3) {
            System.out.println("0");
            return;
        }

        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (canTriangle(line[i], line[j], line[k])) {
                        if (line[i] != line[j] && line[j] != line[k] && line[i] != line[k]) {
                            //System.out.println(i + " " + j + " " + k);
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static boolean canTriangle(long a, long b, long c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}
