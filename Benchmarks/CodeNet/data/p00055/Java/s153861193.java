import java.util.*;

class Main {

    static void solve (double f) {
        double [] seq = new double[10];
        seq[0] = f;
        for(int i = 1; i < 10; i++) {
            if (i % 2 == 0) seq[i] = seq[i-1] / 3;
            else            seq[i] = seq[i-1] * 2;
        }

        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += seq[i];
        }

        System.out.println(sum);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            double first = sc.nextDouble();
            solve(first);
        }

    }
}