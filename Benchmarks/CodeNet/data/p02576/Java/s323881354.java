import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();
        int T = s.nextInt();

        int a = N%X == 0 ? 0 : T;

        System.out.println((N / X) * T + a);
    }
}