import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double x = Double.parseDouble(sc.next());

            sum += (sc.next().equals("BTC")) ? x * 380000 : x;
        }

        System.out.println(sum);
    }
}
