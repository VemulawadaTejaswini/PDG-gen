import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");
        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);
        int H = Integer.parseInt(line[2]);
        int M = Integer.parseInt(line[3]);
        double radA = Math.PI * (60 * H + M) / (60 * 12) * 2;
        double radB = Math.PI * M / 60 * 2;
        double C = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.abs(radA - radB)));
        System.out.println(C);
    }
}
