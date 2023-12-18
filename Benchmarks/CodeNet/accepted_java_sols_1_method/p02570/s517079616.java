import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        double ans = (double) d / (double) s;
        if (ans <= t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}