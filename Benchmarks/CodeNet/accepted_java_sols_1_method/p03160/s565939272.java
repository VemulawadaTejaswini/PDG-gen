import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            values[i] = -1;
        }
        values[0] = 0;
        values[1] = Math.abs(arr[1] - arr[0]);
        for (int i = 2; i < count; i++) {
            int first = values[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int second = values[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            values[i] = Math.min(first, second);
        }
        System.out.println(values[count - 1]);
    }
}