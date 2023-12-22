import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double l = 100000;
        for (int i = 1; i <= n; i++) {
            l *= 1.05;
            if (l%1000 != 0) {
                l += (1000 - (l%1000));
            }
        }
        System.out.println((long)l);
    }
}