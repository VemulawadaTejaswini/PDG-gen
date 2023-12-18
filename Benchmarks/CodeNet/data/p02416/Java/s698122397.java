import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String x = sc.next();

            if ("0".equals(x)) break;

            int sum = 0;
            for (String s : x.split("")) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}