import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int x = 0;
        int l = 0;
        int r = 0;
        for (int i = 0 ; i < n ; i++) {
            if (s[i] == '(') {
                l++;
            }
            if (s[i] == ')') {
                r++;
            }
            x = Math.min(x, l - r);
        }
        int d = l - r;
        for (int i = 0 ; i < -1 * x ; i++) {
            System.out.print("(");
        }
        System.out.print(s);
        for (int i = 0 ; i < d - x ; i++) {
            System.out.print(")");
        }
        System.out.println("");

    }

}