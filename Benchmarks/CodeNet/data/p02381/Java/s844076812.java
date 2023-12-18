import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }

            double[] score = new double[n];

            double sum = 0.0;
            for(int i=0; i<n; i++) {
                score[i] = sc.nextDouble();
                sum += score[i];
            }

            double avg = sum / n;

            double nSum = 0.0;
            for(int i=0; i<n; i++) {
                nSum += Math.pow(score[i]-avg, 2);
            }

            double tmp = nSum / n;
            System.out.println(String.format("%.9f",Math.sqrt(tmp)));
        }
        sc.close();
    }
}

