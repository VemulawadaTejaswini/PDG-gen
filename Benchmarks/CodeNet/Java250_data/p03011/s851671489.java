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
        int c = inp.nextInt();
        int ans = Math.min(Math.min(a + b, b + c), a + c);
        System.out.println(ans);
    }
}
