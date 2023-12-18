import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for (int i=0; i<3; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for (int i=0; i<3; i++) {
            System.out.print(A[i]);
            if (i == 0 || i == 1)
                System.out.print(" ");
        }
        System.out.println();
    }
}
