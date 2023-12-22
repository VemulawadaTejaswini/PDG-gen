import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), arr[] = new int[n], count = 1;
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) if (arr[i] > arr[i - 1]) count++;
        System.out.println(count);
    }
}