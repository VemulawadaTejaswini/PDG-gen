import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String ss = inp.next();
        char s[] = ss.toCharArray();
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == '+') ans++;
            else ans--;
        }
        System.out.println(ans);
        inp.close();
    }
}
