import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.close();
        int ans = 0;
        for (int i = 0; i <= a; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}