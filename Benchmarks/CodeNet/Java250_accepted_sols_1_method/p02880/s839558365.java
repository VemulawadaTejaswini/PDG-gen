import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        // int ans = A < 10 && B < 10 ? A * B : -1;

        Boolean flg = false;
        for (int i = 9; i >= 1; i--) {
            if (N % i == 0 && N / i <= 9) {
                flg = true;
                break;
            }
        }

        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}