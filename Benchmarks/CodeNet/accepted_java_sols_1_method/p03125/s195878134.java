import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        if (b % a == 0) System.out.println(a + b);
        else System.out.println(b - a);
        inp.close();
    }
}
