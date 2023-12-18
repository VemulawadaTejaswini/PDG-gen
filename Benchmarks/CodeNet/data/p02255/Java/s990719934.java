
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    static int n;
    static int[] data;
    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st[i]);
        }

        for (int i = 1; i < n; i++) {
            printData();
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
        printData();
        bw.flush();
    }

    static void printData() throws IOException {
        bw.append("" + data[0]);
        for (int j = 1; j < n; j++) {
            bw.append(" " + data[j]);
        }
        bw.newLine();
    }

}
