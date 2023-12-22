import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int count = 0;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        for (int i = 0; i < N; i++) {
            String s = S.charAt(i) + "";
            if (s.equals("A")) {
                a = true;
                b = false;
                c = false;
            } else if (s.equals("B") && a && !b && !c) {
                b = true;
                c = false;
            } else if (s.equals("C") && a && b && !c) {
                c = true;
                count++;
            } else {
                a = false;
                b = false;
                c = false;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
