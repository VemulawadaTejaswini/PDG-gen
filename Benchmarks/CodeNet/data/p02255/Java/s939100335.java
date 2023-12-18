import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void trace(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.printf("%d", a[i]);
        }
        System.out.print("\n");
    }

    public static void sort(int[] data, int n) {
        int tmp, j;
        for (int i = 1; i < n; i++) {
            tmp = data[i];
            j = i - 1;
            while (j >= 0 && data[j] > tmp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
            trace(data, n);

        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int[] data;
        String[] input_data;
        try {
            n = Integer.parseInt(br.readLine());
            data = new int[n];

            input_data = br.readLine().split(" ");
            for (int i = 0; i < input_data.length; i++)
                data[i] = Integer.parseInt(input_data[i]);

            trace(data, n);
            sort(data, n);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
