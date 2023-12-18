import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        String[] lines = br.readLine().split(" ");
        int m = n;
        while (m-- > 0) {
            list[m] = Integer.parseInt(lines[m]);
        }
        print(list);
        insertionSort(list);

    }

    static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int v = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > v) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = v;
            print(list);
        }
    }

    private static void print(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}