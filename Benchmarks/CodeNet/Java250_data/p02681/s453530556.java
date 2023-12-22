import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        String s = inp.next();
        String t = inp.next();
        if (s.length() + 1 == t.length()) {
            if (s.equals(t.substring(0, s.length()))) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else System.out.println("No");
    }
}
