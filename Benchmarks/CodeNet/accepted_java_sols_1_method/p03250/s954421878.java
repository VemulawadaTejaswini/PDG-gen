import java.util.*;

public class Main {
    public static void main(String ard[]) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int max;
        max = A * 10 + B + C;
        if (max < A + B * 10 + C) {
            max = A + B * 10 + C;
        }
        if (max < A + B + C * 10) {
            max = A + B + C * 10;
        }

        System.out.println(max);

        scan.close();
    }
}