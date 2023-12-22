import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String a = inp.next();
        String b = inp.next();
        String c = inp.next();
        inp.close();
        int k = Integer.parseInt(a + b + c);
        if (k % 4 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}