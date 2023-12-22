import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            int keta1 = i / 10000;
            int keta2 = i / 1000 % 10;
            int keta4 = i / 10 % 10;
            int keta5 = i % 10;
            if (keta1 == keta5 && keta2 == keta4) count++;
        }

        System.out.println(count);
    }
}