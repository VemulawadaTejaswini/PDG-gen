import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        while (true) {
            int n = inScanner.nextInt();
            int p = inScanner.nextInt();

            if (n == 0 && p == 0) {
                break;
            }

            int[] ninzu = new int[n];
            int i = 0;
            while (!isWin(ninzu) || p > 0) {
                if (i >= n) {
                    i = 0;
                }

                if (p <= 0) {
                    p += ninzu[i];
                    ninzu[i] = 0;
                }
                else {
                    p -= 1;
                    ninzu[i] += 1;
                }
                i++;
            }

            System.out.println(i -1);
        }
    }

    public static boolean isWin(int[] son) {
        int ii = 0;
        for (int i = 0; i < son.length; i++) {
            if (son[i] != 0) {
                ii++;
            }
        }

        if (ii == 1)
            return true;
        else
            return false;
    }
}