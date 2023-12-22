import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        sc.close();

        int ans = 0;
        if (A+B==3) {
            ans = 3;
        } else if (A+B==4) {
            ans = 2;
        } else {
            ans = 1;
        }
        System.out.println(ans);
    }
}