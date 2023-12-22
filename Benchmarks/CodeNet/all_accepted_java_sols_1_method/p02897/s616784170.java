import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int numi = Integer.parseInt(num);

        int count = 0;
        for (int i = 1; i <=numi; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        double result = (double)count/numi;
        System.out.println(result);
    }
}
