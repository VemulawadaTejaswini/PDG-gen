import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int a = 0;
        int b = 0;
        char[] C = S.toCharArray();

        for (int i=1; i < C.length; i += 2) {
            if (C[i] == 'R') {
                System.out.println("No");
                System.exit(0);
            }
        }
        for (int i=0; i < C.length; i += 2) {
            if (C[i] == 'L') {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}