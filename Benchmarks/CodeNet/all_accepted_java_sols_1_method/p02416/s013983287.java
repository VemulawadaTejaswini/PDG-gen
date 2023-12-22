import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.next();
            if (x.equals("0")) {
                break;
            }

            int i, j;
            int Sum = 0;
            char s;
            for (i = 0; i < x.length(); i++) {
                s = x.charAt(i);
                j = s - '0';
                Sum += j;
            }
            System.out.println(Sum);

        }
    }
}
