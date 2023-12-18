import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];

        for(int i=0; i<N; i++){
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        long a = x[0], b = y[0];
        for(int i=1 ;i<N;i++){

            long k = Math.max((a - 1)/x[i] + 1, (b - 1)/y[i] + 1);
            a = x[i] * k;
            b = y[i] * k;
        }

        System.out.println(a + b);
    }
}


