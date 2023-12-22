import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int num = 0;
        boolean flg = false;
        while (n > 0) {
            num = n % 10;
            if (num == 7) {
                flg = true;
                break;
            }
            n /= 10;
        }
        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
