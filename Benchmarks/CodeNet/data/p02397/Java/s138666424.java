import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String data[] = reader.readLine().split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            if (a == 0 && b == 0) {
                break;
            }
            sb.append(a < b ? a : b).append(" ").append(a < b ? b : a).append("\n");
}        }
        System.out.print(sb);
    }