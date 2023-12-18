
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int y = Integer.parseInt(st[0]);
            int x = Integer.parseInt(st[1]);
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (i == 0 || j == 0 || i == (y - 1) || j == (x - 1)) {
                        bw.append("#");
                    } else {
                        bw.append(".");
                    }
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }


}
