import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int a = inp.nextInt();
        int b = inp.nextInt();
        inp.close();
        x -= a;
        int p = (int)Math.floor(x / b);
        System.out.println(x - b * p);
    }
}
