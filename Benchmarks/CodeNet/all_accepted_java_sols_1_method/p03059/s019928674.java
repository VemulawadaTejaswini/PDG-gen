import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        int count = 0;
        int n = 1;
        while (true) {
            if ((t + 0.5) < a * n) {
                break;
            }
            n++;
            count += b;

        }
        System.out.println(count);
    }


}
