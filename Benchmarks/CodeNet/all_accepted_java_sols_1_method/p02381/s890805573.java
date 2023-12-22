import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {

            int[] score = new int[n];

            double ave = 0.0;
            double val = 0.0;

            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
                ave += score[i];
            }
            ave /= n * 1.0;

            for(int i = 0; i < n; i++)
                val += (score[i] - ave) *  (score[i] - ave);

            val /= n *1.0;

            double sgm = Math.sqrt(val);

            System.out.printf("%f\n", sgm);

            n = sc.nextInt();
        }

        sc.close();
    }
}

