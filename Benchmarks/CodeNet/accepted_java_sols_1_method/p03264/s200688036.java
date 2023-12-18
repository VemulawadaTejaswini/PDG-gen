import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if (a % 2 == 0) System.out.println(a * a / 4);
        else {
            int a1 = a / 2;
            int a2 = a1 + 1;
            System.out.println(a1 * a2);
        }
        inp.close();
    }
}
