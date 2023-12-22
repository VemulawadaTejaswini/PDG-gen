
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String a = sc.next();
            if (a.equals("-")) {
                break;
            }
            int b = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum = sc.nextInt();
                a = a.substring(sum,a.length()) + a.substring(0,sum);
            }
            System.out.println(a);
        }
    }
}

