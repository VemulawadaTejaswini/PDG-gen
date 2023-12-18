import java.io.*;
import java.util.HashSet;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] w = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(br.readLine());
            if (max < w[i]) {
                max = w[i];
            }
        }

        int load;
        int capacity = max;
        int i, j;
        while (true) {
            load = 0;
            j = 0;

            for (i = 0; i < k; i++) {
                load = 0;
                while (load <= capacity) {
                    load += w[j];
                    j++;
                    if (j == w.length && load <= capacity) {
                        System.out.println(capacity);
                        return;
                    }
                }
                j--;
            }
            capacity++;
        }
    }
}