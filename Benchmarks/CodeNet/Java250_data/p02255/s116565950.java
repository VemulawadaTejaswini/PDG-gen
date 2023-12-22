

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    private static void print_arr (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
    }

    private static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            print_arr(arr);
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = key;
            }
        }
        print_arr(arr);
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