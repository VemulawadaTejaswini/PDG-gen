import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int ans = 0;
        if (a + b > 23) ans = a + b - 24;
        else ans = a + b;
        System.out.println(ans);
    }
}