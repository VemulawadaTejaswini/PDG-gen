import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A, B, C, D;
        D = N % 10;
        N /= 10;
        C = N % 10;
        N /= 10;
        B = N % 10;
        N /= 10;
        A = N;

        if (A + B + C + D == 7) System.out.printf("%d+%d+%d+%d=7", A, B, C, D);
        else if (A + B + C - D == 7) System.out.printf("%d+%d+%d-%d=7", A, B, C, D);
        else if (A + B - C + D == 7) System.out.printf("%d+%d-%d+%d=7", A, B, C, D);
        else if (A + B - C - D == 7) System.out.printf("%d+%d-%d-%d=7", A, B, C, D);
        else if (A - B + C + D == 7) System.out.printf("%d-%d+%d+%d=7", A, B, C, D);
        else if (A - B + C - D == 7) System.out.printf("%d-%d+%d-%d=7", A, B, C, D);
        else if (A - B - C + D == 7) System.out.printf("%d-%d-%d+%d=7", A, B, C, D);
        else if (A - B - C - D == 7) System.out.printf("%d-%d-%d-%d=7", A, B, C, D);
    }
}