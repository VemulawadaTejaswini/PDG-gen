import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int X = stdIn.nextInt();
        int Y = stdIn.nextInt();
        int Z = stdIn.nextInt();
        stdIn.close();

        int A = 0;
        int B = 0;

        A = X;
        X = Y;
        Y = A;

        B = X;
        X = Z;
        Z = B;

        System.out.printf("%d %d %d", X, Y, Z);
    }
}