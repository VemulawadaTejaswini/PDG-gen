import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int swapCount = 0;
        int flag = 1;
        while (flag == 1) {
            flag = 0;
            for (int j = N - 1; j >= 1; j--) {
                if (A[j] < A[j - 1]) {
                    int tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                    swapCount++;
                    flag = 1;
                }
            }
        }
        String delimiter = "";
        for (int a : A) {
            System.out.print(delimiter + a);
            delimiter = " ";
        }
        System.out.println();
        System.out.println(swapCount);
        sc.close();
    }
}
