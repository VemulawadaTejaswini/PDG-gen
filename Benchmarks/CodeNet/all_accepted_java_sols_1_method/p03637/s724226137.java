import java.util.Scanner;

public class Main {

    public static final int MOD = (int) (Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int odd = 0;
        int two = 0;
        int four = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (a % 2 != 0) {
                odd++;
            } else if (a % 4 == 0) {
                four++;
            } else {
                two++;
            }
        }
        if (two == 0) {
            if (four - odd >= -1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (four - odd >= 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}