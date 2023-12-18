import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int h = 0, m = 0, s = 0;
        while (n >= 3600) {
            n -= 3600;
            h++;
        }
        while (n >= 60) {
            n -= 60;
            m++;
        }
        s = n;
        bw.append(h + ":" + m + ":" + s + "\n");
        bw.flush();
    }


}
