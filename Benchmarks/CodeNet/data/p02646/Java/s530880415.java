import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();

        if (W >= V) {
            System.out.println("NO");
            return;
        }

        if (A < B) {
            System.out.println(A+(long)T*V >= B+(long)T*W ? "YES" : "NO");
        } else {
            System.out.println(A+(long)T*V <= B+(long)T*W ? "YES" : "NO");
        }
    }
}
