import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        double tmp = 100000.0;

        for (int i = 0; i < n; i++) {
            tmp *= 1.05;
            tmp /= 1000;
            tmp = Math.ceil(tmp);
            tmp *= 1000;
        }

        System.out.println((int)tmp);
    }
}