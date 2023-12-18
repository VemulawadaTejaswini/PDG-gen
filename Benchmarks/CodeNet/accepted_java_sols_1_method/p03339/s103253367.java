import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int[] cs1 = new int[n];
        int[] cs2 = new int[n];

        for (int i = 1; i < n-1; i++) {
            if (s.charAt(i-1) == 'W') {
                cs1[i]++;
            }
            cs1[i+1] = cs1[i];

            if (s.charAt(n-i) == 'E') {
                cs2[n-i-1]++;
            }
            cs2[n-i-2] = cs2[n-i-1];
        }

        int min = n - 1;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, cs1[i] + cs2[i]);
        }

        System.out.println(min);
    }
}
