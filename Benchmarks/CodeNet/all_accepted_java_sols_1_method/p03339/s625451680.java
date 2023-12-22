import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int e = 0;
        for (int i = 1; i < n; i++) {
            if (c[i] == 'E') {
                e++;
            }
        }
        int w = 0;
        int min = e;
        for (int i = 1; i < n; i++) {
            if (c[i - 1] == 'W') {
                w++;
            }
            if (c[i] == 'E') {
                e--;
            }
            min = Math.min(min, w + e);
        }
        System.out.println(min);
    }
}