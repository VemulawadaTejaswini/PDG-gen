import java.util.*;

public class Main {
    static int N;
    static int M;
    static int K;
    static String S;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < S.length(); i++) {
            switch(S.charAt(i)) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
            }
        }
        int max = -1;
        int min = 10000000;
        max = Math.max(a, max);
        max = Math.max(b, max);
        max = Math.max(c, max);
        min = Math.min(a, min);
        min = Math.min(b, min);
        min = Math.min(c, min);
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}