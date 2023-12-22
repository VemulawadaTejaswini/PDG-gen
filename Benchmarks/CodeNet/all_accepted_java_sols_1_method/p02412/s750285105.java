import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, x, count = 0;
        String[] data;

        try {
            while (true) {
                data = br.readLine().split(" ");
                n = Integer.parseInt(data[0]);
                x = Integer.parseInt(data[1]);
                if (n == 0 && x == 0)
                    return;
                for (int i = 1; i <= n; i++) {
                    for (int j = i + 1; j <= n; j++) {
                        for (int k = j + 1; k <= n; k++) {
                            if (i + j + k == x)
                                count++;
                        }
                    }
                }
                System.out.println(count);
                count = 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
