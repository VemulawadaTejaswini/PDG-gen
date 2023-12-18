import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        int i = 1;
        int cnt = 0;
        int sum = 0;
        while (true) {
            if (sum >= x) {
                break;
            }
            sum += i;
            cnt++;
            i++;
        }
        System.out.println(cnt);
    }
}