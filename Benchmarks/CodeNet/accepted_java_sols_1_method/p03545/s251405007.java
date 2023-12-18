import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.next().toCharArray();
        scanner.close();

        char[] op = new char[arr.length - 1];

        // bit全探索
        // 集合 (1, 2, 3) の部分集合(1, 12, 123 など) の種類で回す (2のn乗 == Math.pow(2, S.length()))
        for (int i = 0; i < (1 << arr.length - 1); i++) {
            int total = arr[0] - '0';
            for (int j = 0; j < arr.length - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    op[j] = '+';
                    total += arr[j + 1] - '0';
                } else {
                    op[j] = '-';
                    total -= arr[j + 1] - '0';
                }
            }
            if (total == 7) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < op.length) {
                System.out.print(op[i]);
            }
        }
        System.out.print("=7");
    }
}
