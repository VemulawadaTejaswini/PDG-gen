import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = sc.next().split("");

        long r = 0;
        int g = 0;
        int b = 0;

        for (String v: s
             ) {
            switch (v) {
                case "R":
                    r++;
                    break;
                case "G":
                    g++;
                    break;
                case "B":
                    b++;
                    break;
            }
        }

        long ans =  r * g * b;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (s[i].equals(s[j])) {
                    continue;
                }
                int v = 2 * j - i;
                if (v >= n) {
                    break;
                }
                if (s[j].equals(s[v]) || s[i].equals(s[v])) {
                    continue;
                }
                ans--;
            }
        }

        System.out.println(ans);
    }
}