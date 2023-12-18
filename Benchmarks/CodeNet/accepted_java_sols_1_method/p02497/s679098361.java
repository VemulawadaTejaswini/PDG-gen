import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();

            if (m == -1 && f == -1 && r == -1) {
                break;
            }

            char result = 'A';
            int mf = m + f;
            if (mf < 80) {
                result = 'B';
            }
            if (mf < 65) {
                result = 'C';
            }
            if (mf < 50) {
                result = 'D';
                if (r >= 50) {
                    result = 'C';
                }
            }
            if (mf < 30 || m == -1 || f == -1) {
                result = 'F';
            }

            System.out.println(result);
        }
    }
}