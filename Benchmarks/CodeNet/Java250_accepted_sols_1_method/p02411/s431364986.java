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
        while (!(input = br.readLine()).equals("-1 -1 -1")) {
            String[] st = input.split(" ");
            int m = Integer.parseInt(st[0]);
            int f = Integer.parseInt(st[1]);
            int r = Integer.parseInt(st[2]);
            if (m < 0 || f < 0) {
                bw.append("F\n");
                continue;
            }

            int score = (m > 0 ? m : 0);
            score += (f > 0 ? f : 0);

            if (score >= 80) {
                bw.append("A");
            } else if (score >= 65) {
                bw.append("B");
            } else if (score >= 50) {
                bw.append("C");
            } else if (score >= 30) {
                if (r >= 50) {
                    bw.append("C");
                } else {
                    bw.append("D");
                }
            } else {
                bw.append("F");
            }
            bw.newLine();
        }
        bw.flush();
    }


}
