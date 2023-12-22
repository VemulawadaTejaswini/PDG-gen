import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        String [] inp = buffer.readLine().split(" ");
        int [] arr = new int[n];
        arr[0] = Integer.parseInt(inp[0]);
        int xor = arr[0];
        for (int pos = 1; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
            xor ^= arr[pos];
        }
        for (int pos = 0; pos < n; pos++) {
            sb.append((xor^arr[pos])+" ");
        }
        System.out.println(sb);
    }
}
