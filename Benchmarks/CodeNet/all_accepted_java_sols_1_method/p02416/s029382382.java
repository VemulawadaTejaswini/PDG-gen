import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.nextLine();
            if (x.equals("0")) {
                break;
            }
            int total = 0;
            for (int i = 0; i < x.length(); i++) {
                total += (x.charAt(i) - '0');
            }
            System.out.println(total);
        }
        sc.close();
    }
}
