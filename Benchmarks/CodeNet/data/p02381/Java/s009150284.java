import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int i = 0, j = 0;
        double[] a;
        a = new double[1000];

        while (i < 1000) {

            int n = sc.nextInt();

            if (n == 0) {
                break ;
            }

            double[] A;
            double m = 0;
            A = new double[n];

            for (j = 0; j < n; ++j) {
                A[j] = sc.nextInt();
                m += A[j];
            }

            m = m / n;

            for (j = 0; j < n; ++j) {
                a[i] += Math.pow((A[j] - m), 2);
            }

            a[i] = a[i] / n;
            a[i] = Math.pow(a[i], 0.5);

            ++i;
        }

        for(j=0;j<i;++j){

            System.out.println(a[j]);

        }
    }


}

