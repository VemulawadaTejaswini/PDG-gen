import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();

        while (true) {
            String[] data = br.readLine().split(" ");
            int a = Integer.parseInt(data[0]);
            String op = data[1];
            int b = Integer.parseInt(data[2]);
            int result = 0;

            if (op.equals("?")) {
                break;
            } else if (op.equals("+")) {
                result = a + b;
            } else if (op.equals("-")) {
                result = a - b;
            } else if (op.equals("*")) {
                result = a * b;
            } else if (op.equals("/")) {
                result = a / b;
            }
            strb.append(result).append("\n");
        }
        System.out.print(strb);
    }
}