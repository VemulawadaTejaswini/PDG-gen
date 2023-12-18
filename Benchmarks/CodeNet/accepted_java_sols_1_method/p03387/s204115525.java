import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = new int[3];
        data[0] = scan.nextInt();
        data[1] = scan.nextInt();
        data[2] = scan.nextInt();
        int sum = data[0] + data[1] + data[2];
        int M = Math.max(Math.max(data[0], data[1]), data[2]);
        int X = 0;
        if (sum % 2 == 0) {
            X = M % 2 == 0 ? M : M + 1;
        } else {
            X = M % 2 == 0 ? M + 1 : M;
        }
        System.out.println((3 * X - sum) / 2);
    }
}