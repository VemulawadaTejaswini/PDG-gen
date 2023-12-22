import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        double A = s.nextDouble();
        double B = s.nextDouble();
        double T = s.nextDouble();
        double tmp = Math.floor((T + 0.5)/A) * B;
        System.out.println((int)tmp);
        s.close();
    }
}