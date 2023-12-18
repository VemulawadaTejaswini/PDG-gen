import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        int sLen = S.length();
        int tLen = T.length();
        if (S.equals(T.substring(0, tLen-1)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
