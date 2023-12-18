import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while (!(line = br.readLine()).equals("0 0")) {
            int n, m, l, taro_sum, hana_sum;
            n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
            m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
            taro_sum = hana_sum = 0;
            boolean[] taro = new boolean[101];
            boolean[] hana = new boolean[101];

            for (int i = 0; i < n; i++) {
                l = Integer.parseInt(br.readLine());
                taro[l] = true;
                taro_sum += l;
            }
            for (int i = 0; i < m; i++) {
                l = Integer.parseInt(br.readLine());
                hana[l] = true;
                hana_sum += l;
            }

            boolean hit = false;
            if (Math.abs(taro_sum - hana_sum) != 1) {
                if (taro_sum < hana_sum) {
                    for (int i = 0, j = (hana_sum - taro_sum) / 2; j < 101; i++, j++) {
                        if (taro[i] && hana[j]) {
                            System.out.println(i + " " + j);
                            hit = true;
                            break;
                        }
                    }
                } else if (taro_sum > hana_sum) {
                    for (int i = (taro_sum - hana_sum) / 2, j = 0; i < 101; i++, j++) {
                        if (taro[i] && hana[j]) {
                            System.out.println(i + " " + j);
                            hit = true;
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < 101; i++) {
                        if (taro[i] && hana[i]) {
                            System.out.println(i + " " + i);
                            hit = true;
                            break;
                        }
                    }
                }
            }
            if (!hit) {
                System.out.println(-1);
            }
        }
    }
}