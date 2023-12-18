import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        boolean res = true;
        int n = s.length();
        for (int i = 0; i < (n-1)/2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) res = false;
        }
        for (int i = 0; i < (n-1)/4; i++) {
            if (s.charAt(i) != s.charAt((n - 1) / 2 - 1 - i)) res = false;
            if (s.charAt((n + 1) / 2 + i) != s.charAt(n - 1 - i)) res = false;
        }        

        if (res) System.out.println("Yes");
        else System.out.println("No");

    }
}