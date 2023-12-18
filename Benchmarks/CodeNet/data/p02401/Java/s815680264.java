import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] lines = br.readLine().split(" ");
            int a = Integer.parseInt(lines[0]);
            String op = lines[1];
            int b = Integer.parseInt(lines[2]);
            if (op.equals("?")) {
                break;
            }
            if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            } else if (op.equals("*")) {
                System.out.println(a * b);
            } else {
                System.out.println(a / b);
            }
        }
    }
}