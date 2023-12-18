import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                bw.append(" ");
            }
            bw.append(st[i]);
        }
        bw.newLine();
        bw.flush();
    }


}
