import java.util.Scanner;

public class Main {
    static int selectSort(int[] data) {
        int ret = 0, n = data.length;
        for (int i = 0; i < n; ++i) {
            int minJ = i;
            for (int j = i; j < n; ++j) {
                if (data[j] < data[minJ]) minJ = j;
            }
            if(minJ != i) {
                ++ret;
                int tmp = data[minJ];
                data[minJ] = data[i];
                data[i] = tmp;
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

        int cnt = selectSort(data);
        for (int i = 0; i < n; ++i) {
            System.out.print(data[i]);
            if (i != n - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(cnt);
    }
}
