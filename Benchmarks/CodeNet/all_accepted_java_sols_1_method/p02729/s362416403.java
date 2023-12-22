import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cn = 0, cm = 0;
        if (n != 0) {
            cn = n * (n - 1) / 2;
        }
        if (m != 0) {
            cm = m * (m - 1) / 2;
        }
        System.out.println(cn + cm);
        sc.close();
    }
}