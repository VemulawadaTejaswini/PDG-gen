import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int sec;
        if (a <= c && c <= b && d <= b) {
            sec = d - c;
        } else if (a <= c && c <= b && d >= b) {
            sec = b - c;
        } else if (a >= c && a <= d && d <= b) {
            sec = d - a;
        } else if (a >= c && a <= d && d > b) {
            sec = b - a;
        } else {
            sec = 0;
        }
        System.out.println(sec);
    }
}
