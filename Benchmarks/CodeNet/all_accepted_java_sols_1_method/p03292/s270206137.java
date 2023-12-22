import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; ++i) {
            arr[i] = in.nextInt();
        } Arrays.sort(arr);
        int ans = 0;
        for (int i = 1; i < 3; ++i) {
            ans += Math.abs(arr[i] - arr[i - 1]);
        }

        System.out.println(ans);
    }


}