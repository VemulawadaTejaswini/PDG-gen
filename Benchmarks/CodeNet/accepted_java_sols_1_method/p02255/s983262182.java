
import java.util.Scanner;

class Main
{

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A[] = new int[N];
        for (int k = 0; k < N; k++) {
            A[k] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int v = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;
            for (int h = 0; h < N; h++) {
                if (h == N - 1) {
                    System.out.println(A[h]);
                } else {
                    System.out.print(A[h] + " ");
                }
            }
        }
    }
}

