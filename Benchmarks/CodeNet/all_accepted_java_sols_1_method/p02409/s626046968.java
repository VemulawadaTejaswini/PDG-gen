import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int[][][] buildings = new int[4][3][10];

            final int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                int[] input = Arrays.stream(in.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int b = input[0] - 1;
                int f = input[1] - 1;
                int r = input[2] - 1;
                int v = input[3];
                buildings[b][f][r] += v;
            }

            StringBuilder sb = new StringBuilder();
            for (int b = 0; b < 4; b++) {
                for (int f = 0; f < 3; f++) {
                    for (int r = 0; r < 10; r++) {
                        sb.append(" ");
                        sb.append(buildings[b][f][r]);
                    }
                    sb.append("\n");
                }
                if (b != 3) {
                    sb.append("####################\n");
                }
            }

            System.out.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

