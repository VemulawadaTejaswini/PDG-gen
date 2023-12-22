import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int A = cin.nextInt();
        int B = cin.nextInt();

        int s = 0;
        for (int i = 1; i <= N; i++) {
            int x = sum(i);
            if (x >= A && x <= B) {
                s += i;
            }
        }

        System.out.println(s);
    }

    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}