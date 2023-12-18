import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        long ans = 0;
        if (n * 2 == m) {
            ans = n;
        } else if (n * 2 > m) {
            ans = m / 2;
        } else {
            long temp = m - n - n;
            temp = (temp / 4) + n;
            ans = temp;
        }
        System.out.println(ans);
    }
}