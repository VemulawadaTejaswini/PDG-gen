import java.util.*;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i, j, k, n, count = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int x, y, z;
        Label: for (n = 1; n <= N; n++) {
            for (i = 1; i <= Math.sqrt(n); i++) {
                for (j = 1; j <= Math.sqrt(n); j++) {
                    for (k = 1; k <= Math.sqrt(n); k++) {
                        if (i * i + j * j + k * k + i * j + j * k + k * i == n) {
                            if (i == j && j == k) {
                                System.out.println(1);
                                continue Label;
                            } else if (i == j || j == k || k == i) {
                                System.out.println(3);
                                continue Label;
                            } else {
                                System.out.println(6);
                                continue Label;
                            }
                        }
                    }
                }
            }
            System.out.println(0);
        }
    }
}