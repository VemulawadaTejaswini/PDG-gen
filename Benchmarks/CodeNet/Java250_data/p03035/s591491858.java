import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        int a = inp.nextInt();
        int b = inp.nextInt();
        int ans = a < 6 ? 0 : (a < 13 ? (b / 2) : b);
        System.out.println(ans);
    }
}
