import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        long num = x;
        int cnt = 1;
        while (true) {
            num *= 2;
            if (num <= y)
                cnt++;
            else
                break;
        }

        System.out.println(cnt);
    }
}