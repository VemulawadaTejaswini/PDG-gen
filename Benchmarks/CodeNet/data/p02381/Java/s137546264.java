import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int count = sc.nextInt();
            if (count == 0) {
                break;
            }
            double[] s = new double[count];
            double sum = 0;
            for (int i = 0; i < count; i++) {
                s[i] = sc.nextDouble();
                sum += s[i];
            }
            double average = sum / count;
            double res = 0;
            for (int i = 0; i < count; i++) {
                res += Math.pow(s[i] - average, 2) / count;
            }
            System.out.println(Math.sqrt(res));
        }
    }
}