import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, tmp;
        for (i = 1; i <= n; i++) {
            if (i % 3 == 0) System.out.print(" "+i);
            else {
                tmp = i;
                while (tmp > 0) {
                    if (tmp % 10 == 3) {
                        System.out.print(" "+i);
                        break;
                    } else {
                        tmp /= 10;
                    }
                }
            }
        }
        System.out.println();
    }
}
