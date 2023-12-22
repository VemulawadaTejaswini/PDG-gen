import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = a - b;
        if (-a + b <= 0) System.out.println("delicious");
        else if (-a + b <= x) System.out.println("safe");
        else System.out.println("dangerous");
    }
}
