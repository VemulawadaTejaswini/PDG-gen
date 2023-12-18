import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int j = 0; j < n; j++) {
            String[] input = br.readLine().split(" ");

            double p1x = Double.parseDouble(input[2]) - Double.parseDouble(input[0]);
            double p1y = Double.parseDouble(input[3]) - Double.parseDouble(input[1]);

            double p2x = Double.parseDouble(input[6]) - Double.parseDouble(input[4]);
            double p2y = Double.parseDouble(input[7]) - Double.parseDouble(input[5]);

            // 外積が0 <=> 平行
            if (p1x * p2y - p1y * p2x == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
