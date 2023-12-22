import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String line = r.readLine();
        int opIndex = 0;
        int[] ops = new int[100];
        for (String elem : line.split(" ")) {
            if (elem.equals("+")) {
                ops[opIndex - 2] += ops[opIndex - 1];
                opIndex--;
            } else if (elem.equals("-")) {
                ops[opIndex - 2] -= ops[opIndex - 1];
                opIndex--;
            } else if (elem.equals("*")) {
                ops[opIndex - 2] *= ops[opIndex - 1];
                opIndex--;
            } else {
                ops[opIndex++] = Integer.parseInt(elem);
            }
        }
        System.out.println(ops[0]);
    }
}