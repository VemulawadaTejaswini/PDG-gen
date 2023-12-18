import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void bubbleSort(int[] data, int n) {
        int count = 0, tmp;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.printf("%d", data[i]);
        }
        System.out.print("\n");
        System.out.println(count);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            int nums[] = new int[n];
            String[] input_string = br.readLine().split(" ");

            for (int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(input_string[i]);

            bubbleSort(nums, n);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
