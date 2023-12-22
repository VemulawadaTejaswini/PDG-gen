import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        char[] cL = new char[n];
        for (int i = 0;i<n; i++) {
            char c = s.charAt(i);
            if (i+1 == k) {
                if (c == 'A') cL[i] = 'a';
                if (c == 'B') cL[i] = 'b';
                if (c == 'C') cL[i] = 'c';
            } else {
                cL[i] = c;
            }
        }
        for (char c : cL) {
            System.out.print(c);
        }
    }
}