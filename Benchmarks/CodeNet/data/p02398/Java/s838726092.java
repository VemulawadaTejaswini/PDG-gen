
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = 0;
        for (int i = a; i <= b; i++) {
            if (c % a == 0) {
                n++;
            }
            a++;
        }
        System.out.println(n);
    }
}
