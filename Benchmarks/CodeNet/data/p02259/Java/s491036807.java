import java.util.Scanner;

public class Main {
    static int bubbleSort(int[] data) {
        int ret = 0, n = data.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (data[j] > data[j + 1]) {
                    ++ret;
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; ++i) {
            data[i] = scanner.nextInt();
        }

        int cnt = bubbleSort(data);
        for (int i = 0; i < n; ++i) {
            System.out.print(data[i]);
            if (i != n - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(cnt);
    }
}
