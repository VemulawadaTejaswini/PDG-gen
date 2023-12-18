import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br.readLine());
        int[] list = createListInt(br.readLine());
        selectionSort(list, n);

    }

    static void selectionSort(int[] list, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[minj]) {
                    minj = j;
                }
            }
            if (i != minj) {
                swap(list, i, minj);
                count++;
            }
        }
        print(list);
        System.out.println(count);
    }

    static void bubbleSort(int[] list, int n) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = n - 1; i > 0; i--) {
                if (list[i] < list[i - 1]) {
                    swap(list, i, i - 1);
                    flag = true;
                    count++;
                }
            }
        }
        print(list);
        System.out.println(count);
    }

    private static void print(int[] list) {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            System.out.print(list[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    static int[] createListInt(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static long[] createListLong(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        long[] list = new long[n];
        while (n-- > 0) {
            list[n] = Long.parseLong(lines[n]);
        }
        return list;
    }

    static int ip(String s) {
        return Integer.parseInt(s);
    }

    static long lp(String s) {
        return Long.parseLong(s);
    }
}