import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < A.length - 1; i++) {

            boolean judge = false;
            int min_j = i;

            for (int j = i; j < A.length; j++) {
                if (A[j] < A[min_j]) {
                    min_j = j;
                    judge = true;
                }
            }

            int tmp = A[i];
            A[i] = A[min_j];
            A[min_j] = tmp;

            if (judge == true) {
                count++;
            }
        }

        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[A.length - 1]);

        System.out.println(count);

        sc.close();
    }
}
