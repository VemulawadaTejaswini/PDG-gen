import java.util.Scanner;

public class Main {
    //B - Distance
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double D = scan.nextDouble();

        int overCount = 0;

        while (N-- > 0) {
            double X = scan.nextDouble();
            double Y = scan.nextDouble();
            double dis = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
            if (dis <= D) {
                overCount++;
            }
        }
        System.out.println(overCount);
    }
}