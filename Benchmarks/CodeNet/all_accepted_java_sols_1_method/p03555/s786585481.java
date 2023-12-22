import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s1 = inp.next();
        String s2 = inp.next();
        s1 = new StringBuffer(s1).reverse().toString();
        System.out.println(s1.equals(s2) ? "YES" : "NO");
    }
}