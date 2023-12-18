import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            bw.append(st[1] + " " + st[0] + "\n");
        }
        bw.flush();
    }

}

