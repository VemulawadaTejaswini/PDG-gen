import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tap = 0;
        int num = 1;
        while (true) {
            if (num >= b) {
                System.out.println(tap);
                break;
            }
            tap++;
            num = tap * a - (tap - 1);
        }
    }

}
