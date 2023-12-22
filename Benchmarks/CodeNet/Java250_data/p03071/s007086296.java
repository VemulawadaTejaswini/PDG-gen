import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int ans = 0;
        for (int i = 0; i < 2; i++) {
            if (a < b) {
                ans += b;
                b--;
            }
            else {
                ans += a;
                a--;
            }
        }
        System.out.println(ans);
        inp.close();
    }
}
