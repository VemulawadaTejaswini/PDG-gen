import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int A;

    static int B;
    static int C;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        int max = Math.max(A, Math.max(B, C));

        int saA = max - A;
        int saB = max - B;
        int saC = max - C;

        int to = saA + saB + saC;

        System.out.println((to / 2) + (to % 2 == 0 ? 0 : 2));

    }




}

