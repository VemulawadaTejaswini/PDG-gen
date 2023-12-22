import java.io.*;
import java.util.HashSet;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] w = new int[n];
        int maxWeight = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(br.readLine());
            if (maxWeight < w[i]) {
                maxWeight = w[i];
            }
            sum += w[i];
        }

        int load;
        int capacity;
        int min = Math.max(maxWeight, sum / k);
        int max = sum;
        int i, j;

        outside: while (max > min) {
            load = 0;
            j = 0;

            capacity = (min + max) / 2;

            for (i = 0; i < k; i++) {
                load = 0;
                while (load <= capacity) {
                    load += w[j];
                    j++;
                    if (j == w.length && load <= capacity) {
                        max = capacity;
                        continue outside;
                    }
                }
                j--;
            }
            min = capacity + 1;
        }
        System.out.println(max);
    }
}