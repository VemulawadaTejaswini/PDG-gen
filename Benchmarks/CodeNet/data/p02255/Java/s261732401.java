

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = key;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().trim().split(" ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        reader.close();
        sort(arr);
    }
}