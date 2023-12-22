import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String ss = inp.next();
        char s[] = ss.toCharArray();
        char ans[] = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '1') ans[i] = '9';
            else ans[i] = '1';
        }
        System.out.println(String.valueOf(ans));
        inp.close();
    }
}
