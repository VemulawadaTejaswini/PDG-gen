import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] as = br.readLine().split(" ");
        int max = -1;
        int min = 1000000005;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(as[i]);
            if (max < a) max = a;
            if (min > a) min = a;
        }
        System.out.println(max-min);
    }
}
