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
        loop:
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[2]);
            switch (st[1]) {
                case "+":
                    bw.append((a + b) + "\n");
                    break;
                case "-":
                    bw.append((a - b) + "\n");
                    break;
                case "*":
                    bw.append((a * b) + "\n");
                    break;
                case "/":
                    if (a > 0 && b > 0) {
                        bw.append((a / b) + "\n");
                    }
                    else{
                        bw.append("0\n");
                    }
                    break;
                case "?":
                    break loop;
            }
        }
        bw.flush();

    }


}
