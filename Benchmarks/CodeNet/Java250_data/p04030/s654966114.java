import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < s.length; i++) {
            char ch = s[i];
            int len = b.length();
            if (ch == 'B' && len > 0) {
                b.deleteCharAt(len - 1);
            } if (ch == 'B') {
            } else {
                b.append(ch);
            }
        }
        System.out.println(b.toString());
        return;
    }

}