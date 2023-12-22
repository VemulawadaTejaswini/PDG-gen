import java.util.Scanner;

public class Main {
    public double calcAverage(int[] buf, int num) {
        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += (double)buf[i];
        }

        return sum/(double)num;
    }
    public double calcSD(int[] buf, int num) {
        double average = calcAverage(buf, num);
        double bunsan;
        double sum = 0.0;

        for (int i = 0; i < num; i++) {
            sum += Math.pow((double)buf[i] - average, 2.0);
        }
        bunsan = sum / (double)num;
        return Math.sqrt(bunsan);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main app = new Main();

        while (true) {
            int num = Integer.parseInt(scan.next());
            if (num == 0) {
                break;
            }
            int[] score = new int[num];
            double sd;
            for (int i = 0; i < num; i++) {
                score[i] = Integer.parseInt(scan.next());
            }

            sd = app.calcSD(score, num);
            System.out.println(sd);
        }
    }
}

