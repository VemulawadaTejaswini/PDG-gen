import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int triangleCount = 0;
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                for (int k = j + 1; k < l.length; k++) {
                    if (canTriangle(l[i], l[j], l[k])) {
                        triangleCount++;
                    }
                }   
            }
        }
        System.out.println(triangleCount);
    }

    private static boolean canTriangle(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            return false;
        }
        if (a > b && a > c) {
            return b + c > a;
        } else if (b > a && b > c) {
            return c + a > b;
        } else {
            return b + a > c;
        }
    }
}
