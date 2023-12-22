import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        String[] data;
        int x, y;
        while (true) {
            data = br.readLine().split(" ");
            x = Integer.parseInt(data[0]);
            y = Integer.parseInt(data[1]);
            if (x == 0 && y == 0) {
                break;
            }
            if (x < y) {
                str.append(x).append(" ").append(y).append("\n");
            } else {
                str.append(y).append(" ").append(x).append("\n");
            }
        }
        System.out.print(str);
    }
}