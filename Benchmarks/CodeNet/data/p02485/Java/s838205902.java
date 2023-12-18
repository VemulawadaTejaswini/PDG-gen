import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.next();
            if (x.equals("0")) {
                break;
            }

            char[] X = x.toCharArray();
            int sum = 0;
            for (int i = 0; i < X.length; i++) {
                sum += X[i] - '0';
            }

            System.out.println(sum);
        }
    }
}