import java.util.Scanner;

public class Main {

    static int f(int a, int b, int c, int k) {
        if (k <= a) return k;
        if (k <= a + b) return a;
        return a - (k - a - b);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), k = in.nextInt();
        System.out.println(f(a, b, c, k));
    }
}
