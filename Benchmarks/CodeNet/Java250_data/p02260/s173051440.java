import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A;
        A = new int[N];
        int i;
        for (i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;

        for (int j = 0; j < A.length - 1; j++) {

            int keyindex = j;

            for (int k = j + 1; k < A.length; k++) {

                if (A[keyindex] > A[k]) {

                    keyindex = k;

                }
            }



            if (j == keyindex) {
                continue;
            }
            int temp = A[j];
            A[j] = A[keyindex];
            A[keyindex] = temp;
            count++;
        }


        for (int g = 0; g < N; g++) {
            System.out.print(A[g]);
            if (g < N - 1) {
                System.out.print(" ");
            }
            if (g == N - 1) {
                System.out.println("");
            }

        }

        System.out.println(count);
    }
}

