import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        long result = -1;

        if(K % 2 == 0) {
            long temp1 = X - 2 * D;
            long temp2 = X + 2 * D;
            result = Math.min(Math.abs(X), Math.min(Math.abs(temp1), Math.abs(temp2)));
        } else {
            long temp1 = X - D;
            long temp2 = X + D;
            result = Math.min(Math.abs(temp1), Math.abs(temp2));
        }

        System.out.println(result);
    }
}
