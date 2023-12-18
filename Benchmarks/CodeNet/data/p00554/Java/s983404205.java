import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int i;
        int A[] = new int[N + N];
        int B[] = new int[N + N];
        int Flag = 0;
        int x[] = new int[M+1];
        int n[] = new int[M+1];
        for (i = 0; i < M; i++) {
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
            x[i] = N - A[i];
            if (A[i] >= B[i]) {
                Flag += 1;
            }
        }

        int y = 0;
        if (Flag >= M - 1) {
            System.out.println(0);
        } else {
            for (i = 0; i < M; i++) {
                if (x[i] > 0) {
                    y += 1;
                    n[y] = x[i];
                }
            }
            int zs;
            int min = 0;
            int index = 0;
            int sun = 0;
            int a;
            zs = (M - 1) - Flag;
            for (i = 0; i < zs; i++) {
                for (a = 1; a <= y; a++) {
                    if (a == 1) {
                        min = n[a];
                        index = 1;
                    } else if (min >= n[a]) {
                        min = n[a];
                        index = a;
                    }
                }

                sun += min;
                n[index] = 99999999;
            }
            System.out.println(sun);

        }

    }
}

