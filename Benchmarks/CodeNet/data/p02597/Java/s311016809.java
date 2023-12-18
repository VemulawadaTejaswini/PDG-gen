import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == 'R') {
                r++;
            }
        }
        int w = 0;
        for (int i = 0; i < r; i++) {
            if (c[i] == 'W') {
                w++;
            }
        }
        System.out.println(w);
    }

}
