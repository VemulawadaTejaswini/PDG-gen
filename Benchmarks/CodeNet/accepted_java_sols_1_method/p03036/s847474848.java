import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int r = Integer.parseInt(in[0]);
        int d = Integer.parseInt(in[1]);
        int x = Integer.parseInt(in[2]);

        for(int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }

        br.close();
    }
}