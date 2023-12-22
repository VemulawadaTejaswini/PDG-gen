import java.util.Scanner;


// 139_b
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 1;

        for (int i = 0; i < 100; i++) {

            if (a + (a - 1) * i >= b) {
                break;
            }
            count++;
        }

        if (b == 1) {
            count = 0;
        }

        System.out.println(count);

    }

}
