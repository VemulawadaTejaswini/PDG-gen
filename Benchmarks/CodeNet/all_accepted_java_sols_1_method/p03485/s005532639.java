import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        inp.close();
        double d = (a + b) / 2.0;
        System.out.println((int)Math.ceil(d));
    }
}