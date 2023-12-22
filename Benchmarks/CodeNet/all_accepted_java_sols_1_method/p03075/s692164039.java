import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = A[4] - A[0];
        if (max <= k) System.out.println("Yay!");
        else System.out.println(":(");
        sc.close();
    }
}