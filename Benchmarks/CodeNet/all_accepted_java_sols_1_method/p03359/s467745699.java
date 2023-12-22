import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        if (a > b) System.out.println(a - 1);
        else System.out.println(a);
        inp.close();
    }
}
