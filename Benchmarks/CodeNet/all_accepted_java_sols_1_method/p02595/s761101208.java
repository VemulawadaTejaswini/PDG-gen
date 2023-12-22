import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        int count = 0;

        for (int i = 0; i < n; i++) {
            double x1 = Double.parseDouble(sc.next());
            double x2 = Double.parseDouble(sc.next());

            if (Math.sqrt(x1 * x1 + x2 * x2) <= d) {
                count++;
            }
        }

        System.out.println(count);


    }

}
