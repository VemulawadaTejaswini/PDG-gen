import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        boolean a = (x == 7 || x == 5 || x == 3);
        String ans = (a ? "YES" : "NO");
        System.out.println(ans);
    }
}