import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    public static long []dp = new long[110000];
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt();

        long [][]arr = new long[n][3];
        for (int i = 0; i < n; i ++){
            arr[i][0] = in.nextLong();
            arr[i][1] = in.nextLong();
            arr[i][2] = in.nextLong();
        }

        long MAX = -1;
        for (int i = 1; i < n; i ++){
            arr[i][0] = Math.max(arr[i-1][1]+arr[i][0], arr[i-1][2]+arr[i][0]);
            arr[i][1] = Math.max(arr[i-1][0]+arr[i][1], arr[i-1][2]+arr[i][1]);
            arr[i][2] = Math.max(arr[i-1][0]+arr[i][2], arr[i-1][1]+arr[i][2]);
        }

        for (int i = 0; i < 3; i ++)
            MAX = Math.max(arr[n-1][i], MAX);

        System.out.println(MAX);
    }
}