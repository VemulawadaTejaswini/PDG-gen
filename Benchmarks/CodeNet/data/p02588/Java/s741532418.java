import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] a = new double[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextDouble();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (i < j) {
                    if ((a[i] * a[j]) % 1 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}