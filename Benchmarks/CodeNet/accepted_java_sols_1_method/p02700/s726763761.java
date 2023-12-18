import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        boolean takahashi = true;
        while (A > 0 && C > 0) {
            if (takahashi) {
                C -= B;
            } else {
                A -= D;
            }
            takahashi = !takahashi;
        }
        System.out.println(A > 0 ? "Yes" : "No");
    }
}
