import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        System.out.println((int)Math.ceil(a / b));
    }
}
