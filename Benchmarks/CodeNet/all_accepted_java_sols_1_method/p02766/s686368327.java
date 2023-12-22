import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC156B - Digitsx

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        while(true) {
            n = n / k;
            ++cnt;
            if (n == 0) break;
        }

        System.out.println(cnt);
    }
}