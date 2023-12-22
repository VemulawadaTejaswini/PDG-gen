import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int n, x, i, j, k, num;

        while (true) {
            input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            x = Integer.parseInt(input[1]);
            if (n == 0 && x == 0) break;
            num = 0;
            for (i = 1; i <= n; i++) {
                for (j = i + 1; j <= n; j++) {
                    for (k = j + 1; k <= n; k++) {
                        if (x - i - j - k == 0) num++;
                    }
                }
            }
            System.out.println(num);
        }
    }
}