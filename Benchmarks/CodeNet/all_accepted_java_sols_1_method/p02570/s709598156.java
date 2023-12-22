import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dts = new int[3];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < 3; i++) {
            dts[i] = Integer.parseInt(str[i]);
        }
        System.out.println(dts[0] - dts[1] * dts[2] <= 0 ? "Yes" : "No");
    }
}
