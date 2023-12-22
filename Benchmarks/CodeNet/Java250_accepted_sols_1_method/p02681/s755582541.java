import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        if (T.substring(0, S.length()).equals(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}