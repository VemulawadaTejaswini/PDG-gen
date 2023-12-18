import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        bw.write(String.format("%d\n", (N - 1) / (K - 1) + ((N - 1) % (K - 1) > 0 ? 1 : 0)));
        bw.flush();
    }
}
