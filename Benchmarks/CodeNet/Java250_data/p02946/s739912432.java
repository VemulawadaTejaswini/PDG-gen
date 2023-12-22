import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        sc.close();

        OneClue(K, X);
    }
    public static void OneClue(int K, int X) {
        if (K == 1) {
            System.out.println(X);
            return;
        }
        for (int i = (X - (K - 1)); i <= X + (K - 1); i++) {
            if (i != (X - (K - 1))) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
    }
}
