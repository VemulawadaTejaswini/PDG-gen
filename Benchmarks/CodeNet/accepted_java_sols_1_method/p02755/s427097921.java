import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        double taxA = 0.08;
        double taxB = 0.10;

        int count = 0;
        while (true) {
            double zeinukiA = Math.floor(count * taxA);
            double zeinukiB = Math.floor(count * taxB);
            if (zeinukiA > A || zeinukiB > B) {
                break;
            }
            if (zeinukiA != A) {
                count++;
                continue;
            }
            if (zeinukiB != B) {
                count++;
                continue;
            }
            System.out.println(count);
            return;
        }
        System.out.println(-1);
    }
}
