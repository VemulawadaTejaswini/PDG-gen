import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        boolean check = false;
        int x, y = 0, z = 0;
        lavel:
        for (x = 0; N >= x; x++) {
            for (y = 0; N >= y; y++) {
                z = N - (x + y);
                if (z < 0) {
                    continue;
                }
                if (x * 10000 + y * 5000 + 1000 * z == Y && x + y + z == N) {
                    check = true;
                    break lavel;
                }

            }
        }
        if (check == true) {
            System.out.print(x + " ");
            System.out.print(y + " ");
            System.out.println(z + " ");

        } else {
            System.out.println("-1 -1 -1");
        }
    }
}
