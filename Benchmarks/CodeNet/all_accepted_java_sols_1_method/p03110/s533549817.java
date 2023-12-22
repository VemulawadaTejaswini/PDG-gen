import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum=0;
        for (int i=0;i<n;i++) {
            double val = sc.nextDouble();
            String cur = sc.next();

            if (cur.equals("JPY")) {
                sum += val;
            } else {
                sum += val * 380000;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}