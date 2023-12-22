import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int sortCount = 0;
        for (int i = 0; i < N; i++) {
            int flag = 0;
            int minj = i;
            for (int j = i; j < N; j++) {
                if (A[j] < A[minj]) {
                    minj = j;
                    flag = 1;
                }
            }
            if (flag == 1) {
                int tmp = A[i];
                A[i] = A[minj];
                A[minj] = tmp;
                sortCount++;
            }
        }
        String delimiter = "";
        for (int a : A) {
            System.out.print(delimiter + a);
            delimiter = " ";
        }
        System.out.println();
        System.out.println(sortCount);
        sc.close();
    }
}
