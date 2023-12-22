import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] price = new int[n];
        int i, j;

        for (i = 0; i < n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        int max = price[1] - price[0];
        int min = price[0] + 1;

        for (i = 0; i < n-1; i++) {
            if (price[i] < min) min = price[i];
            else continue;

            for (j = i+1; j < n; j++) {
                if (price[j] - min > max) {
                    max = price[j] - min;
                }
            }
        }
        System.out.println(max);
    }
}