import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        boolean[] notPrime = new boolean[1000000];
        int[] counts = new int[1000000];
        for (int i = 2; i < 1000000; i++) {
            counts[i] += counts[i - 1];
            if (notPrime[i]) {
                continue;
            }
            counts[i]++;
            for (int j = 2; i * j < 1000000; j++) {
                notPrime[i * j] = true;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            sb.append(counts[Integer.parseInt(s)]).append("\n");
        }
        System.out.print(sb);
    }
}
