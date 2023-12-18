import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nn = n;
        int s = 0;
        while (nn > 0) {
            s += nn % 10;
            nn /= 10;
        }

        if (n % s == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
