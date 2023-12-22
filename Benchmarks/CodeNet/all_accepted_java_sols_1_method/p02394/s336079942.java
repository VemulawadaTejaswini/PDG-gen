import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        for (int i=0; i<5; i++) {
            A[i] = sc.nextInt();
        }
        int x_max = A[2] + A[4];
        int x_min = A[2] - A[4];
        int y_max = A[3] + A[4];
        int y_min = A[3] - A[4];

        if (x_max <= A[0] & x_min >= 0 & y_max <= A[1] & y_min >= 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
