import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        sc.close();

        int diff = Math.min(B, D) - Math.max(A, C);
        int count = diff < 0 ? 0 : diff;

        System.out.println(count);

    }
}